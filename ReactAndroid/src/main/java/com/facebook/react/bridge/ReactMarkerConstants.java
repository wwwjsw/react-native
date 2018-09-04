// Copyright (c) 2004-present, Facebook, Inc.

// This source code is licensed under the MIT license found in the
// LICENSE file in the root directory of this source tree.

package com.facebook.react.bridge;

import android.support.annotation.StringDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Constants used by ReactMarker.
 */
@StringDef({
  ReactMarkerConstants.CREATE_REACT_CONTEXT_START,
  ReactMarkerConstants.CREATE_REACT_CONTEXT_END,
  ReactMarkerConstants.PROCESS_PACKAGES_START,
  ReactMarkerConstants.PROCESS_PACKAGES_END,
  ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START,
  ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END,
  ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START,
  ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END,
  ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START,
  ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END,
  ReactMarkerConstants.RUN_JS_BUNDLE_START,
  ReactMarkerConstants.RUN_JS_BUNDLE_END,
  ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START,
  ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END,
  ReactMarkerConstants.SETUP_REACT_CONTEXT_START,
  ReactMarkerConstants.SETUP_REACT_CONTEXT_END,
  ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START,
  ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END,
  ReactMarkerConstants.CREATE_VIEW_MANAGERS_START,
  ReactMarkerConstants.CREATE_VIEW_MANAGERS_END,
  ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START,
  ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END,
  ReactMarkerConstants.NATIVE_MODULE_SETUP_START,
  ReactMarkerConstants.NATIVE_MODULE_SETUP_END,
  ReactMarkerConstants.CREATE_MODULE_START,
  ReactMarkerConstants.CREATE_MODULE_END,
  ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START,
  ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END,
  ReactMarkerConstants.CREATE_I18N_MODULE_CONSTANTS_START,
  ReactMarkerConstants.CREATE_I18N_MODULE_CONSTANTS_END,
  ReactMarkerConstants.I18N_MODULE_CONSTANTS_CONVERT_START,
  ReactMarkerConstants.I18N_MODULE_CONSTANTS_CONVERT_END,
  ReactMarkerConstants.CREATE_I18N_ASSETS_MODULE_START,
  ReactMarkerConstants.CREATE_I18N_ASSETS_MODULE_END,
  ReactMarkerConstants.GET_CONSTANTS_START,
  ReactMarkerConstants.GET_CONSTANTS_END,
  ReactMarkerConstants.INITIALIZE_MODULE_START,
  ReactMarkerConstants.INITIALIZE_MODULE_END,
  ReactMarkerConstants.ON_HOST_RESUME_START,
  ReactMarkerConstants.ON_HOST_RESUME_END,
  ReactMarkerConstants.ON_HOST_PAUSE_START,
  ReactMarkerConstants.ON_HOST_PAUSE_END,
  ReactMarkerConstants.CONVERT_CONSTANTS_START,
  ReactMarkerConstants.CONVERT_CONSTANTS_END,
  ReactMarkerConstants.PRE_REACT_CONTEXT_END,
  ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_CHECK_START,
  ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_CHECK_END,
  ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_EXTRACTED,
  ReactMarkerConstants.UNPACKING_JS_BUNDLE_LOADER_BLOCKED,
  ReactMarkerConstants.LOAD_APPLICATION_SCRIPT_START_STRING_CONVERT,
  ReactMarkerConstants.LOAD_APPLICATION_SCRIPT_END_STRING_CONVERT,
  ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START,
  ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END,
  ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START,
  ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START,
  ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END,
  ReactMarkerConstants.CONTENT_APPEARED,
  ReactMarkerConstants.RELOAD,
  ReactMarkerConstants.DOWNLOAD_START,
  ReactMarkerConstants.DOWNLOAD_END,
  ReactMarkerConstants.REACT_CONTEXT_THREAD_START,
  ReactMarkerConstants.REACT_CONTEXT_THREAD_END,
  ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START,
  ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END,
  ReactMarkerConstants.GET_REACT_INSTANCE_HOLDER_SPEC_START,
  ReactMarkerConstants.GET_REACT_INSTANCE_HOLDER_SPEC_END,
  ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START,
  ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END,
  ReactMarkerConstants.PROCESS_INFRA_PACKAGE_START,
  ReactMarkerConstants.PROCESS_INFRA_PACKAGE_END,
  ReactMarkerConstants.PROCESS_PRODUCT_PACKAGE_START,
  ReactMarkerConstants.PROCESS_PRODUCT_PACKAGE_END,
  ReactMarkerConstants.CREATE_MC_MODULE_START,
  ReactMarkerConstants.CREATE_MC_MODULE_END,
  ReactMarkerConstants.CREATE_MC_MODULE_GET_METADATA_START,
  ReactMarkerConstants.CREATE_MC_MODULE_GET_METADATA_END,
  ReactMarkerConstants.REGISTER_JS_SEGMENT_START,
  ReactMarkerConstants.REGISTER_JS_SEGMENT_STOP
})
@Retention(RetentionPolicy.SOURCE)
public @interface ReactMarkerConstants {
  String CREATE_REACT_CONTEXT_START = "CREATE_REACT_CONTEXT_START";
  String CREATE_REACT_CONTEXT_END = "CREATE_REACT_CONTEXT_END";
  String PROCESS_PACKAGES_START = "PROCESS_PACKAGES_START";
  String PROCESS_PACKAGES_END = "PROCESS_PACKAGES_END";
  String BUILD_NATIVE_MODULE_REGISTRY_START = "BUILD_NATIVE_MODULE_REGISTRY_START";
  String BUILD_NATIVE_MODULE_REGISTRY_END = "BUILD_NATIVE_MODULE_REGISTRY_END";
  String CREATE_CATALYST_INSTANCE_START = "CREATE_CATALYST_INSTANCE_START";
  String CREATE_CATALYST_INSTANCE_END = "CREATE_CATALYST_INSTANCE_END";
  String DESTROY_CATALYST_INSTANCE_START = "DESTROY_CATALYST_INSTANCE_START";
  String DESTROY_CATALYST_INSTANCE_END = "DESTROY_CATALYST_INSTANCE_END";
  String RUN_JS_BUNDLE_START = "RUN_JS_BUNDLE_START";
  String RUN_JS_BUNDLE_END = "RUN_JS_BUNDLE_END";
  String NATIVE_MODULE_INITIALIZE_START = "NATIVE_MODULE_INITIALIZE_START";
  String NATIVE_MODULE_INITIALIZE_END = "NATIVE_MODULE_INITIALIZE_END";
  String SETUP_REACT_CONTEXT_START = "SETUP_REACT_CONTEXT_START";
  String SETUP_REACT_CONTEXT_END = "SETUP_REACT_CONTEXT_END";
  String CREATE_UI_MANAGER_MODULE_START = "CREATE_UI_MANAGER_MODULE_START";
  String CREATE_UI_MANAGER_MODULE_END = "CREATE_UI_MANAGER_MODULE_END";
  String CREATE_VIEW_MANAGERS_START = "CREATE_VIEW_MANAGERS_START";
  String CREATE_VIEW_MANAGERS_END = "CREATE_VIEW_MANAGERS_END";
  String CREATE_UI_MANAGER_MODULE_CONSTANTS_START = "CREATE_UI_MANAGER_MODULE_CONSTANTS_START";
  String CREATE_UI_MANAGER_MODULE_CONSTANTS_END = "CREATE_UI_MANAGER_MODULE_CONSTANTS_END";
  String NATIVE_MODULE_SETUP_START = "NATIVE_MODULE_SETUP_START";
  String NATIVE_MODULE_SETUP_END = "NATIVE_MODULE_SETUP_END";
  String CREATE_MODULE_START = "CREATE_MODULE_START";
  String CREATE_MODULE_END = "CREATE_MODULE_END";
  String PROCESS_CORE_REACT_PACKAGE_START = "PROCESS_CORE_REACT_PACKAGE_START";
  String PROCESS_CORE_REACT_PACKAGE_END = "PROCESS_CORE_REACT_PACKAGE_END";
  String CREATE_I18N_MODULE_CONSTANTS_START = "CREATE_I18N_MODULE_CONSTANTS_START";
  String CREATE_I18N_MODULE_CONSTANTS_END = "CREATE_I18N_MODULE_CONSTANTS_END";
  String I18N_MODULE_CONSTANTS_CONVERT_START = "I18N_MODULE_CONSTANTS_CONVERT_START";
  String I18N_MODULE_CONSTANTS_CONVERT_END = "I18N_MODULE_CONSTANTS_CONVERT_END";
  String CREATE_I18N_ASSETS_MODULE_START = "CREATE_I18N_ASSETS_MODULE_START";
  String CREATE_I18N_ASSETS_MODULE_END = "CREATE_I18N_ASSETS_MODULE_END";
  String GET_CONSTANTS_START = "GET_CONSTANTS_START";
  String GET_CONSTANTS_END = "GET_CONSTANTS_END";
  String INITIALIZE_MODULE_START = "INITIALIZE_MODULE_START";
  String INITIALIZE_MODULE_END = "INITIALIZE_MODULE_END";
  String ON_HOST_RESUME_START = "ON_HOST_RESUME_START";
  String ON_HOST_RESUME_END = "ON_HOST_RESUME_END";
  String ON_HOST_PAUSE_START = "ON_HOST_PAUSE_START";
  String ON_HOST_PAUSE_END = "ON_HOST_PAUSE_END";
  String CONVERT_CONSTANTS_START = "CONVERT_CONSTANTS_START";
  String CONVERT_CONSTANTS_END = "CONVERT_CONSTANTS_END";
  String PRE_REACT_CONTEXT_END = "PRE_REACT_CONTEXT_END";
  String UNPACKING_JS_BUNDLE_LOADER_CHECK_START = "UNPACKING_JS_BUNDLE_LOADER_CHECK_START";
  String UNPACKING_JS_BUNDLE_LOADER_CHECK_END = "UNPACKING_JS_BUNDLE_LOADER_CHECK_END";
  String UNPACKING_JS_BUNDLE_LOADER_EXTRACTED = "UNPACKING_JS_BUNDLE_LOADER_EXTRACTED";
  String UNPACKING_JS_BUNDLE_LOADER_BLOCKED = "UNPACKING_JS_BUNDLE_LOADER_BLOCKED";
  String LOAD_APPLICATION_SCRIPT_START_STRING_CONVERT = "loadApplicationScript_startStringConvert";
  String LOAD_APPLICATION_SCRIPT_END_STRING_CONVERT = "loadApplicationScript_endStringConvert";
  String PRE_SETUP_REACT_CONTEXT_START = "PRE_SETUP_REACT_CONTEXT_START";
  String PRE_SETUP_REACT_CONTEXT_END = "PRE_SETUP_REACT_CONTEXT_END";
  String PRE_RUN_JS_BUNDLE_START = "PRE_RUN_JS_BUNDLE_START";
  String ATTACH_MEASURED_ROOT_VIEWS_START = "ATTACH_MEASURED_ROOT_VIEWS_START";
  String ATTACH_MEASURED_ROOT_VIEWS_END = "ATTACH_MEASURED_ROOT_VIEWS_END";
  String CONTENT_APPEARED = "CONTENT_APPEARED";
  String RELOAD = "RELOAD";
  String DOWNLOAD_START = "DOWNLOAD_START";
  String DOWNLOAD_END = "DOWNLOAD_END";
  String REACT_CONTEXT_THREAD_START = "REACT_CONTEXT_THREAD_START";
  String REACT_CONTEXT_THREAD_END = "REACT_CONTEXT_THREAD_END";
  String GET_REACT_INSTANCE_MANAGER_START = "GET_REACT_INSTANCE_MANAGER_START";
  String GET_REACT_INSTANCE_MANAGER_END = "GET_REACT_INSTANCE_MANAGER_END";
  String GET_REACT_INSTANCE_HOLDER_SPEC_START = "GET_REACT_INSTANCE_HOLDER_SPEC_START";
  String GET_REACT_INSTANCE_HOLDER_SPEC_END = "GET_REACT_INSTANCE_HOLDER_SPEC_END";
  String BUILD_REACT_INSTANCE_MANAGER_START = "BUILD_REACT_INSTANCE_MANAGER_START";
  String BUILD_REACT_INSTANCE_MANAGER_END = "BUILD_REACT_INSTANCE_MANAGER_END";
  String PROCESS_INFRA_PACKAGE_START = "PROCESS_INFRA_PACKAGE_START";
  String PROCESS_INFRA_PACKAGE_END = "PROCESS_INFRA_PACKAGE_END";
  String PROCESS_PRODUCT_PACKAGE_START = "PROCESS_PRODUCT_PACKAGE_START";
  String PROCESS_PRODUCT_PACKAGE_END = "PROCESS_PRODUCT_PACKAGE_END";
  String CREATE_MC_MODULE_START = "CREATE_MC_MODULE_START";
  String CREATE_MC_MODULE_END = "CREATE_MC_MODULE_END";
  String CREATE_MC_MODULE_GET_METADATA_START = "CREATE_MC_MODULE_GET_METADATA_START";
  String CREATE_MC_MODULE_GET_METADATA_END = "CREATE_MC_MODULE_GET_METADATA_END";
  String REGISTER_JS_SEGMENT_START = "REGISTER_JS_SEGMENT_START";
  String REGISTER_JS_SEGMENT_STOP = "REGISTER_JS_SEGMENT_STOP";
}