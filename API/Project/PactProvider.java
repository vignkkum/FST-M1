package Activities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import au.com.dius.pact.core.model.annotations.PactFolder;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;

@Provider(UserProvider)
@PactFolder(targetpacts)
public class PactProviderTest {
	@BeforeEach
	void before(PactVerificationContext context) {
	     Set target for provider to send request to
	    context.setTarget(new HttpTestTarget(localhost, 8282));
	}
	
	@TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactTestTemplate(PactVerificationContext context) {
  	    Verify the interaction between Consumer and Provider
  	    using the contract generated in targetpacts
  	   context.verifyInteraction();
    }
	 State to send the call to consumer
	@State(A request to create a user)
	public void sampleState() {}

}
© 2021 GitHub, Inc.
