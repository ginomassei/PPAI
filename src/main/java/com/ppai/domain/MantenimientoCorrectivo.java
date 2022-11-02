package com.ppai.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "MANTENIMIENTOS_CORRECTIVOS")
public class MantenimientoCorrectivo extends Mantenimiento { }
