package pl.cba.gibcode.modelLibrary.card;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import org.immutables.value.Value;
import pl.cba.gibcode.modelLibrary.ordercomponent.OrderComponentBody;

import javax.validation.Valid;

@ApiModel(value = "CreateCardBody", description = "")
@Valid
@JsonDeserialize(as = ImmutableCreateCardBody.class)
@JsonSerialize(as = ImmutableCreateCardBody.class)
@Value.Immutable
public interface CreateCardBody extends OrderComponentBody, CardDetailsBodyFragment {

}
