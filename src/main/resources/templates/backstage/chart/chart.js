/**
 * @namespace Chart
 */
var Chart = require('../chart/core/core')();

Chart.helpers = require('../chart/helpers/index');

// @todo dispatch these helpers into appropriated helpers/helpers.* file and write unit tests!
require('../chart/core/core.helpers')(Chart);

Chart.defaults = require('../chart/core/core.defaults');
Chart.Element = require('../chart/core/core.element');
Chart.elements = require('../chart/elements/index');
Chart.Interaction = require('.../chart/chart/core/core.interaction');
Chart.platform = require('../chart/platforms/platform');

require('../chart/core/core.plugin')(Chart);
require('../chart/core/core.animation')(Chart);
require('../chart/core/core.controller')(Chart);
require('../chart/core/core.datasetController')(Chart);
require('../chart/core/core.layoutService')(Chart);
require('../chart/core/core.scaleService')(Chart);
require('../chart/core/core.scale')(Chart);
require('../chart/core/core.tooltip')(Chart);

require('../chart/scales/scale.linearbase')(Chart);
require('../chart/scales/scale.category')(Chart);
require('../chart/scales/scale.linear')(Chart);
require('../chart/scales/scale.logarithmic')(Chart);
require('../chart/scales/scale.radialLinear')(Chart);
require('../chart/scales/scale.time')(Chart);

// Controllers must be loaded after elements
// See Chart.core.datasetController.dataElementType
require('../chart/controllers/controller.bar')(Chart);
require('../chart/controllers/controller.bubble')(Chart);
require('../chart/controllers/controller.doughnut')(Chart);
require('../chart/controllers/controller.line')(Chart);
require('../chart/controllers/controller.polarArea')(Chart);
require('../chart/controllers/controller.radar')(Chart);
require('../chart/controllers/controller.scatter')(Chart);

require('../chart/charts/Chart.Bar')(Chart);
require('../chart/charts/Chart.Bubble')(Chart);
require('../chart/charts/Chart.Doughnut')(Chart);
require('../chart/charts/Chart.Line')(Chart);
require('../chart/charts/Chart.PolarArea')(Chart);
require('../chart/charts/Chart.Radar')(Chart);
require('../chart/charts/Chart.Scatter')(Chart);

// Loading built-it plugins
var plugins = [];

plugins.push(
	require('../chart/plugins/plugin.filler')(Chart),
	require('../chart/plugins/plugin.legend')(Chart),
	require('../chart/plugins/plugin.title')(Chart)
);

Chart.plugins.register(plugins);

Chart.platform.initialize();

module.exports = Chart;
if (typeof window !== 'undefined') {
	window.Chart = Chart;
}

// DEPRECATIONS

/**
 * Provided for backward compatibility, use Chart.helpers.canvas instead.
 * @namespace Chart.canvasHelpers
 * @deprecated since version 2.6.0
 * @todo remove at version 3
 * @private
 */
Chart.canvasHelpers = Chart.helpers.canvas;
