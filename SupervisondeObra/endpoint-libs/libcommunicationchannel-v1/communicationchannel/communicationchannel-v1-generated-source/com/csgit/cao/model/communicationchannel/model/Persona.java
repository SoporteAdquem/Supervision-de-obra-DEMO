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
 * Model definition for Persona.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the communicationchannel. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Persona extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ap_Materno")
  private java.lang.String apMaterno;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ap_Paterno")
  private java.lang.String apPaterno;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cargo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cedulaProfesional;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direccion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emails;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("fecha_Nacimiento")
  private java.lang.String fechaNacimiento;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fotografia;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idEmpresa;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Persona") @com.google.api.client.json.JsonString
  private java.lang.Long idPersona;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Tipo_Persona") @com.google.api.client.json.JsonString
  private java.lang.Long idTipoPersona;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iniciales;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombre;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String radios;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rfc;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telefonos;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tituloProfesional;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String usuarioSkype;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean visible;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApMaterno() {
    return apMaterno;
  }

  /**
   * @param apMaterno apMaterno or {@code null} for none
   */
  public Persona setApMaterno(java.lang.String apMaterno) {
    this.apMaterno = apMaterno;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getApPaterno() {
    return apPaterno;
  }

  /**
   * @param apPaterno apPaterno or {@code null} for none
   */
  public Persona setApPaterno(java.lang.String apPaterno) {
    this.apPaterno = apPaterno;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCargo() {
    return cargo;
  }

  /**
   * @param cargo cargo or {@code null} for none
   */
  public Persona setCargo(java.lang.String cargo) {
    this.cargo = cargo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCedulaProfesional() {
    return cedulaProfesional;
  }

  /**
   * @param cedulaProfesional cedulaProfesional or {@code null} for none
   */
  public Persona setCedulaProfesional(java.lang.String cedulaProfesional) {
    this.cedulaProfesional = cedulaProfesional;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDireccion() {
    return direccion;
  }

  /**
   * @param direccion direccion or {@code null} for none
   */
  public Persona setDireccion(java.lang.String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEmails() {
    return emails;
  }

  /**
   * @param emails emails or {@code null} for none
   */
  public Persona setEmails(java.lang.String emails) {
    this.emails = emails;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaNacimiento() {
    return fechaNacimiento;
  }

  /**
   * @param fechaNacimiento fechaNacimiento or {@code null} for none
   */
  public Persona setFechaNacimiento(java.lang.String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFotografia() {
    return fotografia;
  }

  /**
   * @param fotografia fotografia or {@code null} for none
   */
  public Persona setFotografia(java.lang.String fotografia) {
    this.fotografia = fotografia;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdEmpresa() {
    return idEmpresa;
  }

  /**
   * @param idEmpresa idEmpresa or {@code null} for none
   */
  public Persona setIdEmpresa(java.lang.Long idEmpresa) {
    this.idEmpresa = idEmpresa;
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
  public Persona setIdPersona(java.lang.Long idPersona) {
    this.idPersona = idPersona;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdTipoPersona() {
    return idTipoPersona;
  }

  /**
   * @param idTipoPersona idTipoPersona or {@code null} for none
   */
  public Persona setIdTipoPersona(java.lang.Long idTipoPersona) {
    this.idTipoPersona = idTipoPersona;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIniciales() {
    return iniciales;
  }

  /**
   * @param iniciales iniciales or {@code null} for none
   */
  public Persona setIniciales(java.lang.String iniciales) {
    this.iniciales = iniciales;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombre() {
    return nombre;
  }

  /**
   * @param nombre nombre or {@code null} for none
   */
  public Persona setNombre(java.lang.String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRadios() {
    return radios;
  }

  /**
   * @param radios radios or {@code null} for none
   */
  public Persona setRadios(java.lang.String radios) {
    this.radios = radios;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRfc() {
    return rfc;
  }

  /**
   * @param rfc rfc or {@code null} for none
   */
  public Persona setRfc(java.lang.String rfc) {
    this.rfc = rfc;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelefonos() {
    return telefonos;
  }

  /**
   * @param telefonos telefonos or {@code null} for none
   */
  public Persona setTelefonos(java.lang.String telefonos) {
    this.telefonos = telefonos;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTituloProfesional() {
    return tituloProfesional;
  }

  /**
   * @param tituloProfesional tituloProfesional or {@code null} for none
   */
  public Persona setTituloProfesional(java.lang.String tituloProfesional) {
    this.tituloProfesional = tituloProfesional;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUsuarioSkype() {
    return usuarioSkype;
  }

  /**
   * @param usuarioSkype usuarioSkype or {@code null} for none
   */
  public Persona setUsuarioSkype(java.lang.String usuarioSkype) {
    this.usuarioSkype = usuarioSkype;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVisible() {
    return visible;
  }

  /**
   * @param visible visible or {@code null} for none
   */
  public Persona setVisible(java.lang.Boolean visible) {
    this.visible = visible;
    return this;
  }

  @Override
  public Persona set(String fieldName, Object value) {
    return (Persona) super.set(fieldName, value);
  }

  @Override
  public Persona clone() {
    return (Persona) super.clone();
  }

}
