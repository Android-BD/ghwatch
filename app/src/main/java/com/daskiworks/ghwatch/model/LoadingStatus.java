/*
 * Copyright 2014 contributors as indicated by the @authors tag.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.daskiworks.ghwatch.model;

import com.daskiworks.ghwatch.R;

/**
 * Status of data loading propagated to view.
 * 
 * @author Vlastimil Elias <vlastimil.elias@worldonline.cz>
 * 
 */
public enum LoadingStatus {

  OK(0), CONN_UNAVAILABLE(R.string.message_err_comm_error_conn_unavailable), AUTH_ERROR(R.string.message_err_comm_error_auth), CONN_ERROR(
      R.string.message_err_comm_error_conn_error), DATA_ERROR(R.string.message_err_comm_error_data_error), UNKNOWN_ERROR(
      R.string.message_err_comm_error_unknown);

  private int resId;

  private LoadingStatus(int resId) {
    this.resId = resId;
  }

  /**
   * @return resource id for error message
   */
  public int getResId() {
    return resId;
  }

}