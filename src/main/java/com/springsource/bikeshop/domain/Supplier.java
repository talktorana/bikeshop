package com.springsource.bikeshop.domain;
import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals
public class Supplier {

    /**
     */
    @NotNull
    @Size(max = 25)
    private String name;

    /**
     */
    @NotNull
    @Size(max = 100)
    private String address;

    /**
     */
    private String description;

    /**
     */
    @Min(1L)
    @Max(99L)
    private int supplierNumber;

    /**
     */
    @Past
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date inceptionDate;

    /**
     */
    @Pattern(regexp = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")
    private String email;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "supplier")
    private Set<Product> products = new HashSet<Product>();
}
