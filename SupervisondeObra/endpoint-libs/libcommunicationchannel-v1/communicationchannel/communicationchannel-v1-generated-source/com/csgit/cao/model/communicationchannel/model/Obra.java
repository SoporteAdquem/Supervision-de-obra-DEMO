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
 * Model definition for Obra.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the communicationchannel. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Obra extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String anticipo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String area;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String borrador;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cargoRevision1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cargoRevision2;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cargoVoBo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String descripcion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direccion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entidadFederativa;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fechaContrato;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fechaFianzaAnticipo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fechaFianzaCumplimiento;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fechaInicioContrato;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fechaTerminoContrato;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idDependencia;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idGobierno;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idSecretaria;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long idUsuario;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_EmpresaContratista") @com.google.api.client.json.JsonString
  private java.lang.Long idEmpresaContratista;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Obra") @com.google.api.client.json.JsonString
  private java.lang.Long idObra;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_Poyecto") @com.google.api.client.json.JsonString
  private java.lang.Long idPoyecto;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("id_ubicacion") @com.google.api.client.json.JsonString
  private java.lang.Long idUbicacion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double importeAjusteCostos;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double importeContratoSinIVA;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double importeConvenioAmpliacion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double importeConvenioReduccion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double importeFiscal1SinIVA;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("limite_Desvio")
  private java.lang.Integer limiteDesvio;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double montoFianzaAnticipo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double montoFianzaCumplimiento;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noContrato;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noFianzaAnticipo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String noFianzaCumplimiento;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombre;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombreEjercicioFiscal1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombreQuienAutoriza;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombreRevision1;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombreRevision2;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nombreVoBo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partidaPresupuestal;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer periodoEjucionDias;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double porcentajeDesvio;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rfc;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subdireccion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String superintendente;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tipoContrato;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean visible;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAnticipo() {
    return anticipo;
  }

  /**
   * @param anticipo anticipo or {@code null} for none
   */
  public Obra setAnticipo(java.lang.String anticipo) {
    this.anticipo = anticipo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getArea() {
    return area;
  }

  /**
   * @param area area or {@code null} for none
   */
  public Obra setArea(java.lang.String area) {
    this.area = area;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBorrador() {
    return borrador;
  }

  /**
   * @param borrador borrador or {@code null} for none
   */
  public Obra setBorrador(java.lang.String borrador) {
    this.borrador = borrador;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCargoRevision1() {
    return cargoRevision1;
  }

  /**
   * @param cargoRevision1 cargoRevision1 or {@code null} for none
   */
  public Obra setCargoRevision1(java.lang.String cargoRevision1) {
    this.cargoRevision1 = cargoRevision1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCargoRevision2() {
    return cargoRevision2;
  }

  /**
   * @param cargoRevision2 cargoRevision2 or {@code null} for none
   */
  public Obra setCargoRevision2(java.lang.String cargoRevision2) {
    this.cargoRevision2 = cargoRevision2;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCargoVoBo() {
    return cargoVoBo;
  }

  /**
   * @param cargoVoBo cargoVoBo or {@code null} for none
   */
  public Obra setCargoVoBo(java.lang.String cargoVoBo) {
    this.cargoVoBo = cargoVoBo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescripcion() {
    return descripcion;
  }

  /**
   * @param descripcion descripcion or {@code null} for none
   */
  public Obra setDescripcion(java.lang.String descripcion) {
    this.descripcion = descripcion;
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
  public Obra setDireccion(java.lang.String direccion) {
    this.direccion = direccion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEntidadFederativa() {
    return entidadFederativa;
  }

  /**
   * @param entidadFederativa entidadFederativa or {@code null} for none
   */
  public Obra setEntidadFederativa(java.lang.String entidadFederativa) {
    this.entidadFederativa = entidadFederativa;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaContrato() {
    return fechaContrato;
  }

  /**
   * @param fechaContrato fechaContrato or {@code null} for none
   */
  public Obra setFechaContrato(java.lang.String fechaContrato) {
    this.fechaContrato = fechaContrato;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaFianzaAnticipo() {
    return fechaFianzaAnticipo;
  }

  /**
   * @param fechaFianzaAnticipo fechaFianzaAnticipo or {@code null} for none
   */
  public Obra setFechaFianzaAnticipo(java.lang.String fechaFianzaAnticipo) {
    this.fechaFianzaAnticipo = fechaFianzaAnticipo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaFianzaCumplimiento() {
    return fechaFianzaCumplimiento;
  }

  /**
   * @param fechaFianzaCumplimiento fechaFianzaCumplimiento or {@code null} for none
   */
  public Obra setFechaFianzaCumplimiento(java.lang.String fechaFianzaCumplimiento) {
    this.fechaFianzaCumplimiento = fechaFianzaCumplimiento;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaInicioContrato() {
    return fechaInicioContrato;
  }

  /**
   * @param fechaInicioContrato fechaInicioContrato or {@code null} for none
   */
  public Obra setFechaInicioContrato(java.lang.String fechaInicioContrato) {
    this.fechaInicioContrato = fechaInicioContrato;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFechaTerminoContrato() {
    return fechaTerminoContrato;
  }

  /**
   * @param fechaTerminoContrato fechaTerminoContrato or {@code null} for none
   */
  public Obra setFechaTerminoContrato(java.lang.String fechaTerminoContrato) {
    this.fechaTerminoContrato = fechaTerminoContrato;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdDependencia() {
    return idDependencia;
  }

  /**
   * @param idDependencia idDependencia or {@code null} for none
   */
  public Obra setIdDependencia(java.lang.Long idDependencia) {
    this.idDependencia = idDependencia;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdGobierno() {
    return idGobierno;
  }

  /**
   * @param idGobierno idGobierno or {@code null} for none
   */
  public Obra setIdGobierno(java.lang.Long idGobierno) {
    this.idGobierno = idGobierno;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdSecretaria() {
    return idSecretaria;
  }

  /**
   * @param idSecretaria idSecretaria or {@code null} for none
   */
  public Obra setIdSecretaria(java.lang.Long idSecretaria) {
    this.idSecretaria = idSecretaria;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdUsuario() {
    return idUsuario;
  }

  /**
   * @param idUsuario idUsuario or {@code null} for none
   */
  public Obra setIdUsuario(java.lang.Long idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdEmpresaContratista() {
    return idEmpresaContratista;
  }

  /**
   * @param idEmpresaContratista idEmpresaContratista or {@code null} for none
   */
  public Obra setIdEmpresaContratista(java.lang.Long idEmpresaContratista) {
    this.idEmpresaContratista = idEmpresaContratista;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdObra() {
    return idObra;
  }

  /**
   * @param idObra idObra or {@code null} for none
   */
  public Obra setIdObra(java.lang.Long idObra) {
    this.idObra = idObra;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdPoyecto() {
    return idPoyecto;
  }

  /**
   * @param idPoyecto idPoyecto or {@code null} for none
   */
  public Obra setIdPoyecto(java.lang.Long idPoyecto) {
    this.idPoyecto = idPoyecto;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIdUbicacion() {
    return idUbicacion;
  }

  /**
   * @param idUbicacion idUbicacion or {@code null} for none
   */
  public Obra setIdUbicacion(java.lang.Long idUbicacion) {
    this.idUbicacion = idUbicacion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getImporteAjusteCostos() {
    return importeAjusteCostos;
  }

  /**
   * @param importeAjusteCostos importeAjusteCostos or {@code null} for none
   */
  public Obra setImporteAjusteCostos(java.lang.Double importeAjusteCostos) {
    this.importeAjusteCostos = importeAjusteCostos;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getImporteContratoSinIVA() {
    return importeContratoSinIVA;
  }

  /**
   * @param importeContratoSinIVA importeContratoSinIVA or {@code null} for none
   */
  public Obra setImporteContratoSinIVA(java.lang.Double importeContratoSinIVA) {
    this.importeContratoSinIVA = importeContratoSinIVA;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getImporteConvenioAmpliacion() {
    return importeConvenioAmpliacion;
  }

  /**
   * @param importeConvenioAmpliacion importeConvenioAmpliacion or {@code null} for none
   */
  public Obra setImporteConvenioAmpliacion(java.lang.Double importeConvenioAmpliacion) {
    this.importeConvenioAmpliacion = importeConvenioAmpliacion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getImporteConvenioReduccion() {
    return importeConvenioReduccion;
  }

  /**
   * @param importeConvenioReduccion importeConvenioReduccion or {@code null} for none
   */
  public Obra setImporteConvenioReduccion(java.lang.Double importeConvenioReduccion) {
    this.importeConvenioReduccion = importeConvenioReduccion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getImporteFiscal1SinIVA() {
    return importeFiscal1SinIVA;
  }

  /**
   * @param importeFiscal1SinIVA importeFiscal1SinIVA or {@code null} for none
   */
  public Obra setImporteFiscal1SinIVA(java.lang.Double importeFiscal1SinIVA) {
    this.importeFiscal1SinIVA = importeFiscal1SinIVA;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLimiteDesvio() {
    return limiteDesvio;
  }

  /**
   * @param limiteDesvio limiteDesvio or {@code null} for none
   */
  public Obra setLimiteDesvio(java.lang.Integer limiteDesvio) {
    this.limiteDesvio = limiteDesvio;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMontoFianzaAnticipo() {
    return montoFianzaAnticipo;
  }

  /**
   * @param montoFianzaAnticipo montoFianzaAnticipo or {@code null} for none
   */
  public Obra setMontoFianzaAnticipo(java.lang.Double montoFianzaAnticipo) {
    this.montoFianzaAnticipo = montoFianzaAnticipo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMontoFianzaCumplimiento() {
    return montoFianzaCumplimiento;
  }

  /**
   * @param montoFianzaCumplimiento montoFianzaCumplimiento or {@code null} for none
   */
  public Obra setMontoFianzaCumplimiento(java.lang.Double montoFianzaCumplimiento) {
    this.montoFianzaCumplimiento = montoFianzaCumplimiento;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNoContrato() {
    return noContrato;
  }

  /**
   * @param noContrato noContrato or {@code null} for none
   */
  public Obra setNoContrato(java.lang.String noContrato) {
    this.noContrato = noContrato;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNoFianzaAnticipo() {
    return noFianzaAnticipo;
  }

  /**
   * @param noFianzaAnticipo noFianzaAnticipo or {@code null} for none
   */
  public Obra setNoFianzaAnticipo(java.lang.String noFianzaAnticipo) {
    this.noFianzaAnticipo = noFianzaAnticipo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNoFianzaCumplimiento() {
    return noFianzaCumplimiento;
  }

  /**
   * @param noFianzaCumplimiento noFianzaCumplimiento or {@code null} for none
   */
  public Obra setNoFianzaCumplimiento(java.lang.String noFianzaCumplimiento) {
    this.noFianzaCumplimiento = noFianzaCumplimiento;
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
  public Obra setNombre(java.lang.String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombreEjercicioFiscal1() {
    return nombreEjercicioFiscal1;
  }

  /**
   * @param nombreEjercicioFiscal1 nombreEjercicioFiscal1 or {@code null} for none
   */
  public Obra setNombreEjercicioFiscal1(java.lang.String nombreEjercicioFiscal1) {
    this.nombreEjercicioFiscal1 = nombreEjercicioFiscal1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombreQuienAutoriza() {
    return nombreQuienAutoriza;
  }

  /**
   * @param nombreQuienAutoriza nombreQuienAutoriza or {@code null} for none
   */
  public Obra setNombreQuienAutoriza(java.lang.String nombreQuienAutoriza) {
    this.nombreQuienAutoriza = nombreQuienAutoriza;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombreRevision1() {
    return nombreRevision1;
  }

  /**
   * @param nombreRevision1 nombreRevision1 or {@code null} for none
   */
  public Obra setNombreRevision1(java.lang.String nombreRevision1) {
    this.nombreRevision1 = nombreRevision1;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombreRevision2() {
    return nombreRevision2;
  }

  /**
   * @param nombreRevision2 nombreRevision2 or {@code null} for none
   */
  public Obra setNombreRevision2(java.lang.String nombreRevision2) {
    this.nombreRevision2 = nombreRevision2;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNombreVoBo() {
    return nombreVoBo;
  }

  /**
   * @param nombreVoBo nombreVoBo or {@code null} for none
   */
  public Obra setNombreVoBo(java.lang.String nombreVoBo) {
    this.nombreVoBo = nombreVoBo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPartidaPresupuestal() {
    return partidaPresupuestal;
  }

  /**
   * @param partidaPresupuestal partidaPresupuestal or {@code null} for none
   */
  public Obra setPartidaPresupuestal(java.lang.String partidaPresupuestal) {
    this.partidaPresupuestal = partidaPresupuestal;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPeriodoEjucionDias() {
    return periodoEjucionDias;
  }

  /**
   * @param periodoEjucionDias periodoEjucionDias or {@code null} for none
   */
  public Obra setPeriodoEjucionDias(java.lang.Integer periodoEjucionDias) {
    this.periodoEjucionDias = periodoEjucionDias;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getPorcentajeDesvio() {
    return porcentajeDesvio;
  }

  /**
   * @param porcentajeDesvio porcentajeDesvio or {@code null} for none
   */
  public Obra setPorcentajeDesvio(java.lang.Double porcentajeDesvio) {
    this.porcentajeDesvio = porcentajeDesvio;
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
  public Obra setRfc(java.lang.String rfc) {
    this.rfc = rfc;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSubdireccion() {
    return subdireccion;
  }

  /**
   * @param subdireccion subdireccion or {@code null} for none
   */
  public Obra setSubdireccion(java.lang.String subdireccion) {
    this.subdireccion = subdireccion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSuperintendente() {
    return superintendente;
  }

  /**
   * @param superintendente superintendente or {@code null} for none
   */
  public Obra setSuperintendente(java.lang.String superintendente) {
    this.superintendente = superintendente;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTipoContrato() {
    return tipoContrato;
  }

  /**
   * @param tipoContrato tipoContrato or {@code null} for none
   */
  public Obra setTipoContrato(java.lang.String tipoContrato) {
    this.tipoContrato = tipoContrato;
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
  public Obra setVisible(java.lang.Boolean visible) {
    this.visible = visible;
    return this;
  }

  @Override
  public Obra set(String fieldName, Object value) {
    return (Obra) super.set(fieldName, value);
  }

  @Override
  public Obra clone() {
    return (Obra) super.clone();
  }

}
