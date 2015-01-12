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
 * Model definition for AvanceFinanciero.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the communicationchannel. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AvanceFinanciero extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer estado;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fechaReporte;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_AvanceFinaciero") @com.google.api.client.json.JsonString
  private java.lang.Long idAvanceFinaciero;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_referencia") @com.google.api.client.json.JsonString
  private java.lang.Long idReferencia;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double pavanceFinanciero;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("porcentaje_tendencia")
  private java.lang.Double porcentajeTendencia;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("tipo_Entidad")
  private java.lang.Integer tipoEntidad;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEstado() {
    return estado;
  }

  /**
   * @param estado estado or {@code null} for none
   */
  public AvanceFinanciero setEstado(java.lang.Integer estado) {
    this.estado = estado;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaReporte() {
    return fechaReporte;
  }

  /**
   * @param fechaReporte fechaReporte or {@code null} for none
   */
  public AvanceFinanciero setFechaReporte(java.lang.String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdAvanceFinaciero() {
    return idAvanceFinaciero;
  }

  /**
   * @param idAvanceFinaciero idAvanceFinaciero or {@code null} for none
   */
  public AvanceFinanciero setIdAvanceFinaciero(java.lang.Long idAvanceFinaciero) {
    this.idAvanceFinaciero = idAvanceFinaciero;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdReferencia() {
    return idReferencia;
  }

  /**
   * @param idReferencia idReferencia or {@code null} for none
   */
  public AvanceFinanciero setIdReferencia(java.lang.Long idReferencia) {
    this.idReferencia = idReferencia;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getPavanceFinanciero() {
    return pavanceFinanciero;
  }

  /**
   * @param pavanceFinanciero pavanceFinanciero or {@code null} for none
   */
  public AvanceFinanciero setPavanceFinanciero(java.lang.Double pavanceFinanciero) {
    this.pavanceFinanciero = pavanceFinanciero;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getPorcentajeTendencia() {
    return porcentajeTendencia;
  }

  /**
   * @param porcentajeTendencia porcentajeTendencia or {@code null} for none
   */
  public AvanceFinanciero setPorcentajeTendencia(java.lang.Double porcentajeTendencia) {
    this.porcentajeTendencia = porcentajeTendencia;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTipoEntidad() {
    return tipoEntidad;
  }

  /**
   * @param tipoEntidad tipoEntidad or {@code null} for none
   */
  public AvanceFinanciero setTipoEntidad(java.lang.Integer tipoEntidad) {
    this.tipoEntidad = tipoEntidad;
    return this;
  }

  @Override
  public AvanceFinanciero set(String fieldName, Object value) {
    return (AvanceFinanciero) super.set(fieldName, value);
  }

  @Override
  public AvanceFinanciero clone() {
    return (AvanceFinanciero) super.clone();
  }

}
