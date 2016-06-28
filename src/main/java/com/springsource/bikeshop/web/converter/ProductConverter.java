package com.springsource.bikeshop.web.converter;
import com.springsource.bikeshop.domain.Product;
import javax.faces.convert.Converter;
import org.springframework.roo.addon.jsf.converter.RooJsfConverter;

@RooJsfConverter(entity = Product.class)
public class ProductConverter implements Converter {
}
