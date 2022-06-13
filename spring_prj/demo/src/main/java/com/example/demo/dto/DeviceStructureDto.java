package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class DeviceStructureDto {
  private String no;
  private String name;

  private List<DeviceInformation> devices;

}
