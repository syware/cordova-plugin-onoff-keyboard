Cordova Plugin to show/hide soft keyboard
======
[Cordova][cordova] plugin to show/hide keyboard on an android device.
## Installation

The plugin can be installed via [Cordova-CLI][CLI].

Execute from the projects root folder:

    $ cordova plugin add https://github.com/syware/cordova-plugin-onoff-keyboard.git

## Remove
To remove the plugin

    $ cordova plugin remove cordova-plugin-onoff-keyboard

## Usage

The plugin creates the object `KeyboardPlugin` and is accessible after *deviceready* has been fired.

```js
document.addEventListener('deviceready', function () {
    // KeyboardPlugin is now available
}, false);
```

### Enable/Disable the keyboard
When a field get focus, you can show or hide the keyboard
```js
// Show keyboard
KeyboardPlugin.show();

// Hide keyboard
KeyboardPlugin.hide()();
```

## License

This software is released under the [Apache 2.0 License][apache2_license].

© 2017 [Syware Sàrl][syware]

[cordova]: https://cordova.apache.org
[CLI]: http://cordova.apache.org/docs/en/edge/guide_cli_index.md.html#The%20Command-line%20Interface
[apache2_license]: http://opensource.org/licenses/Apache-2.0
[syware]: https://www.syware.ch
