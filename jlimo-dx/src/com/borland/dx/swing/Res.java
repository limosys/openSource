/* DO NOT EDIT THIS FILE
 *
 * Copyright (c) 2005 Borland Software Corporation. All Rights Reserved.
 *
 */

package com.borland.dx.swing;
import com.borland.jb.util.*;
import java.util.ResourceBundle;

public class Res {
  public static final StringArrayResourceBundle bundle =
              (StringArrayResourceBundle)ResourceBundle.getBundle("com.borland.dx.swing.ResTable");

  static String getString(int index) {
    return bundle.getString(index);
  }
}
