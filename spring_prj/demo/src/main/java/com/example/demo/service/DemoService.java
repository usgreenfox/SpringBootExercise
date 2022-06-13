package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.dto.DeviceAttribute;
import com.example.demo.dto.DeviceInformation;
import com.example.demo.dto.DeviceStructureDto;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
  

  public DeviceStructureDto demo() {
    DeviceStructureDto dto = new DeviceStructureDto();
    DeviceInformation device = new DeviceInformation();
    DeviceAttribute attribute1 = new DeviceAttribute();
    attribute1.setProperty("name");
    attribute1.setValue("Foo");
    DeviceAttribute attribute2 = new DeviceAttribute();
    attribute2.setProperty("height");
    attribute2.setValue("170");
    device.setAttributes(Arrays.asList(attribute1, attribute2));
    dto.setDevices(Arrays.asList(device));

    dto.getDevices().forEach( d -> {
      d.getAttributes().forEach(attr -> {
        propertyToField(dto, attr.getProperty(), attr.getValue());
      });
    });
    return null;
  }



  public void propertyToField(DeviceStructureDto dto, String propertyId, String value) {
    switch(propertyId) {
      case "NO":
        dto.setNo(value);
        break;
      default:
        break;
    }
  }
}
