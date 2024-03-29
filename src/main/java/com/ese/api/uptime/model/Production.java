package com.ese.api.uptime.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "production")
public class Production implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "docno")
  private String docno;

  @Column(name = "shift_id")
  private Integer shiftId;

  @Column(name = "product")
  private Integer product;

  @Column(name = "target")
  private Integer target;

  @Column(name = "takttime")
  private Float takttime;

  @Column(name = "planstart")
  private java.util.Date planstart = new Date();

  @Column(name = "planfinish")
  private java.util.Date planfinish = new Date();

  @Column(name = "break1start")
  private java.util.Date break1start = new Date();

  @Column(name = "break1finish")
  private java.util.Date break1finish = new Date();

  @Column(name = "break2start")
  private java.util.Date break2start = new Date();

  @Column(name = "break2finish")
  private java.util.Date break2finish = new Date();

  @Column(name = "break3start")
  private java.util.Date break3start = new Date();

  @Column(name = "break3finish")
  private java.util.Date break3finish = new Date();

  @Column(name = "actualstart")
  private java.util.Date actualstart = new Date();

  @Column(name = "actualfinish")
  private java.util.Date actualfinish = new Date();

  @Column(name = "totaldowntime")
  private Integer totaldowntime;

  @Column(name = "balance")
  private Integer balance;

  @Column(name = "machine_register_id")
  private Integer machineRegisterId;

  @Column(name = "status_id")
  private Integer statusId;

  @Column(name = "operation_id")
  private Integer operationId;

  @Column(name = "factory_id")
  private Integer factoryId;

  @Column(name = "create_datetime")
  private java.util.Date createDatetime = new Date();

  @Column(name = "create_by")
  private Integer createBy;

  @Column(name = "modify_datetime")
  private java.util.Date modifyDatetime = new Date();

  @Column(name = "is_active")
  private Boolean active = Boolean.FALSE;

  @Column(name = "modify_by")
  private Integer modifyBy;

  @Column(name = "oee_target")
  private Integer oeeTarget;

  @Column(name = "actual_ok")
  private Integer actualOk;

  @Column(name = "actual_ng")
  private Integer actualNg;
}
