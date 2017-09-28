
var exec = require('cordova/exec');

var PLUGIN_NAME = 'KeyboardPlugin';

var KeyboardPlugin = {
  show: function() {
    exec(null, null, PLUGIN_NAME, "show", []);
  },
  hide: function() {
    exec(null, null, PLUGIN_NAME, "hide", []);
  }
};

module.exports = KeyboardPlugin;
