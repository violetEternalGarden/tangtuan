package com.cj.tangtuan.interceptors;

import com.cj.tangtuan.utils.CookieTool;
import com.cj.tangtuan.utils.common.Status;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by XD on 2018/1/8.
 * 后端拦截器
 */
public class AdminInterceptors implements HandlerInterceptor {

    //不校验登陆和token的
    String[] urls = new String[] {
            "/admin",
            "/admin/ifLogin",
            "/admin/ifLogout",
            "/admin/to"

    };


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println(">>>AdminInterceptors>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");

//        return true;// 只有返回true才会继续向下执行，返回false取消当前请求

        String Path = request.getContextPath();  //上下文路径
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+Path+"/"; //全路径






        String requestURI = request.getRequestURI();  //请求全路径
        String path = request.getServletPath();  //请求路径
        System.out.println("===========================================================================================");
        System.out.println("Path===>"+Path);
        System.out.println("basePath===>"+basePath);
        System.out.println("requestURI===>"+requestURI);
        System.out.println("path===>"+path);
        System.out.println("===========================================================================================");
        boolean bool = true;
        boolean bool2 = true;
        System.out.println("============================后端拦截器====================================");
        System.out.println(requestURI);
        System.out.println(path);

        System.out.println("============================后端拦截器====================================");

        try {

            //不检验token和登陆的url
            for (String url : urls) {
                if (url.equals(path)) {
                    bool = false;
                    break;

                }
            }



            //校验Token
            if (bool) {
//                String sessionId = request.getParameter("sessionId");
//                HttpSession session = MySessionContext.getSession(sessionId);


                HttpSession session = request.getSession();
                String adminName  = (String)session.getAttribute("adminName");
                if(adminName==null){  //未登录
                    System.out.println("====================管理员未登录============================");
                    //没有登陆，转向登陆界面
                    response.sendRedirect(Path+ Status.Static+Status.IFLOGIN+Status.Suffix);
                    return false;
                }

                //cookie中的token
                String token = CookieTool.getCookieValueByName(request,"token");

                if (null != token && !"".equals(token)) {

                    if (!(session.getAttribute("Token").equals(token))) {

                        //传入的token和session中 保存的token不匹配
                        System.out.println("====================token不匹配============================");
//                        request.getRequestDispatcher(request.getContextPath()+Status.IFLOGIN+Status.Suffix).forward(request,response);
                        response.sendRedirect(Path+Status.Static+Status.IFLOGIN+Status.Suffix);

                        return false;
                    }else {
                        System.out.println("====================token匹配上了============================");
                        return true;
                    }
                } else {  //token为null或""
                    // token不存在
                    System.out.println("====================token不存在============================");
                    response.sendRedirect(Path+Status.Static+Status.IFLOGIN+Status.Suffix);
                    return false;
                }
            }else {  //不校验登陆和token
                System.out.println("====================无需校验登陆和token============================");
                return true;
            }

        } finally {
            request = null;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println(">>>AdminInterceptors>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println(">>>AdminInterceptors>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }

}
