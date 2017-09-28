package org.apache.cordova.labs.keyboard;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class KeyboardPlugin extends CordovaPlugin {

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
  }

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if(action.equals("show")){
        ((InputMethodManager) cordova.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)).toggleSoftInput(0, InputMethodManager.HIDE_IMPLICIT_ONLY);
        return true;
    }
    else if(action.equals("hide")){
      cordova.getThreadPool().execute(new Runnable() {
        public void run() {
          InputMethodManager inputManager = (InputMethodManager) cordova.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
          View v = cordova.getActivity().getCurrentFocus();

          if (v == null) {
              // Nothing to do no current focus
          } else {
              inputManager.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
          }
        }
      });
      return true;
    }
    callbackContext.error(action + " is not a supported action");
    return false;
  }
}
