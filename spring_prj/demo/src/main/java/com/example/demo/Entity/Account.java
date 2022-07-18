package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity /* 本クラスをエンティティとして扱うことができる。 */
@Data /* ゲッター、セッターを省略することができる。 */
public class Account { /* クラス名はテーブル名と揃える */
  /* カラム名をフィールドとして定義する。 */
  @Id /* PKカラムに付与する */
  private String account_id;

  private String email;

  private String password;

  private String userName;
}
