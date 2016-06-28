package com.springsource.bikeshop.domain;
import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.springsource.bikeshop.reference.ProductType;
import javax.persistence.Enumerated;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.persistence.Lob;
import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals
public class Product {

    /**
     */
    @NotNull
    @Size(max = 25)
    private String name;

    /**
     */
    @Size(max = 250)
    private String description;

    /**
     */
    @NotNull
    @Enumerated
    private ProductType productType;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date releaseDate;

    /**
     */
    @DecimalMin("0.0")
    @DecimalMax("9.99")
    private BigDecimal weight;

    /**
     */
    @RooUploadedFile(contentType = "image/jpeg")
    @Lob
    private byte[] image;

    /**
     */
    @NotNull
    @ManyToOne
    private Supplier supplier;
}
