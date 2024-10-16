package org.aacp;

import java.time.*;

import javax.persistence.*;

import org.openxava.model.*;

import lombok.*;

@Entity @Getter @Setter

public class Pet extends Identifiable {
	private String name;
	private String breed;
	private String description;
	private LocalDate dateOfBirth;

}
