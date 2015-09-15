/*
 * Copyright 2014 eBay Software Foundation and selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.selendroid.server.common.http;

import java.nio.charset.Charset;

public interface IHttpResponse {

    IHttpResponse setStatus(int status);

    IHttpResponse setContentType(String mimeType);

    IHttpResponse setContent(byte[] data);

    IHttpResponse setContent(String message);

    IHttpResponse setEncoding(Charset charset);

    IHttpResponse sendRedirect(String to);

    IHttpResponse sendTemporaryRedirect(String to);

    void end();

    boolean isClosed();
}
