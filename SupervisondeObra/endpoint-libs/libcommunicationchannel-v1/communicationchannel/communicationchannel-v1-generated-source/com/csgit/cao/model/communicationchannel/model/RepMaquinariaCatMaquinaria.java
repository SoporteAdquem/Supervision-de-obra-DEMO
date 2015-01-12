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
 * Model definition for RepMaquinariaCatMaquinaria.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the communicationchannel. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepMaquinariaCatMaquinaria extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cantidad;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idCatMaquinaria;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idDispo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idRepMaquinaria;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idReporteDiario;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCantidad() {
    return cantidad;
  }

  /**
   * @param cantidad cantidad or {@code null} for none
   */
  public RepMaquinariaCatMaquinaria setCantidad(java.lang.Long cantidad) {
    this.cantidad = cantidad;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * @param email email or {@code null} for none
   */
  public RepMaquinariaCatMaquinaria setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdCatMaquinaria() {
    return idCatMaquinaria;
  }

  /**
   * @param idCatMaquinaria idCatMaquinaria or {@code null} for none
   */
  public RepMaquinariaCatMaquinaria setIdCatMaquinaria(java.lang.Long idCatMaquinaria) {
    this.idCatMaquinaria = idCatMaquinaria;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdDispo() {
    return idDispo;
  }

  /**
   * @param idDispo idDispo or {@code null} for none
   */
  public RepMaquinariaCatMaquinaria setIdDispo(java.lang.Long idDispo) {
    this.idDispo = idDispo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdRepMaquinaria() {
    return idRepMaquinaria;
  }

  /**
   * @param idRepMaquinaria idRepMaquinaria or {@code null} for none
   */
  public RepMaquinariaCatMaquinaria setIdRepMaquinaria(java.lang.Long idRepMaquinaria) {
    this.idRepMaquinaria = idRepMaquinaria;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdReporteDiario() {
    return idReporteDiario;
  }

  /**
   * @param idReporteDiario idReporteDiario or {@code null} for none
   */
  public RepMaquinariaCatMaquinaria setIdReporteDiario(java.lang.Long idReporteDiario) {
    this.idReporteDiario = idReporteDiario;
    return this;
  }

  @Override
  public RepMaquinariaCatMaquinaria set(String fieldName, Object value) {
    return (RepMaquinariaCatMaquinaria) super.set(fieldName, value);
  }

  @Override
  public RepMaquinariaCatMaquinaria clone() {
    return (RepMaquinariaCatMaquinaria) super.clone();
  }

}
