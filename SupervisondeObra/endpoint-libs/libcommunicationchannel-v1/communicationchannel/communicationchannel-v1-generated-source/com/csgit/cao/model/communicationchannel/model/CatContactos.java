/*
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
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2015-01-10 at 02:56:28 UTC 
 * Modify at your own risk.
 */

package com.csgit.cao.model.communicationchannel.model;

/**
 * Model definition for CatContactos.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the communicationchannel. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CatContactos extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Obra") @com.google.api.client.json.JsonString
  private java.lang.Long idObra;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Persona") @com.google.api.client.json.JsonString
  private java.lang.Long idPersona;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Poryecto") @com.google.api.client.json.JsonString
  private java.lang.Long idPoryecto;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_cat_contactos") @com.google.api.client.json.JsonString
  private java.lang.Long idCatContactos;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdObra() {
    return idObra;
  }

  /**
   * @param idObra idObra or {@code null} for none
   */
  public CatContactos setIdObra(java.lang.Long idObra) {
    this.idObra = idObra;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdPersona() {
    return idPersona;
  }

  /**
   * @param idPersona idPersona or {@code null} for none
   */
  public CatContactos setIdPersona(java.lang.Long idPersona) {
    this.idPersona = idPersona;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdPoryecto() {
    return idPoryecto;
  }

  /**
   * @param idPoryecto idPoryecto or {@code null} for none
   */
  public CatContactos setIdPoryecto(java.lang.Long idPoryecto) {
    this.idPoryecto = idPoryecto;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdCatContactos() {
    return idCatContactos;
  }

  /**
   * @param idCatContactos idCatContactos or {@code null} for none
   */
  public CatContactos setIdCatContactos(java.lang.Long idCatContactos) {
    this.idCatContactos = idCatContactos;
    return this;
  }

  @Override
  public CatContactos set(String fieldName, Object value) {
    return (CatContactos) super.set(fieldName, value);
  }

  @Override
  public CatContactos clone() {
    return (CatContactos) super.clone();
  }

}