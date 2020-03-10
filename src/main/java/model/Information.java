package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Information {
 private int usefulness;
 private int essentiality;
 private int uselessness;
 private int harmfulness;
}
