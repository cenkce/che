/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.core.jsonrpc.commons;

/**
 * Represents JSON RPC response object. Can be constructed out of stringified json object or by
 * passing specific parameters.
 */
public class JsonRpcResponse {
  private final String id;
  private final JsonRpcResult result;
  private final JsonRpcError error;

  public JsonRpcResponse(String id, JsonRpcResult result, JsonRpcError error) {
    this.id = id;
    this.result = result;
    this.error = error;
  }

  public boolean hasId() {
    return id != null;
  }

  public boolean hasError() {
    return error != null;
  }

  public boolean hasResult() {
    return result != null;
  }

  public JsonRpcError getError() {
    return error;
  }

  public String getId() {
    return id;
  }

  public JsonRpcResult getResult() {
    return result;
  }
}
