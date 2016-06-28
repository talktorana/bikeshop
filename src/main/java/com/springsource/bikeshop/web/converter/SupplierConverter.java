package com.springsource.bikeshop.web.converter;
import com.springsource.bikeshop.domain.Supplier;
import javax.faces.convert.Converter;
import org.springframework.roo.addon.jsf.converter.RooJsfConverter;

@RooJsfConverter(entity = Supplier.class)
public class SupplierConverter implements Converter {
}
