package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InlineResponse200  {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("single")
  private Boolean single = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSingle() {
    return single;
  }
  public void setSingle(Boolean single) {
    this.single = single;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return (name == null ? inlineResponse200.name == null : name.equals(inlineResponse200.name)) &&
        (single == null ? inlineResponse200.single == null : single.equals(inlineResponse200.single));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (single == null ? 0: single.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  single: ").append(single).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
