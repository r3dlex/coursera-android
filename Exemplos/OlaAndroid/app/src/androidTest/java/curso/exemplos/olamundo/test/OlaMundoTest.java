package curso.exemplos.olamundo.test;

// Taken from Hello Testing Tutorial
// http://developer.android.com/resources/tutorials/testing/helloandroid_test.html

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import curso.exemplos.olamundo.OlaMundo;

public class OlaMundoTest extends
		ActivityInstrumentationTestCase2<OlaMundo> {

	private OlaMundo mActivity;
	private TextView mView;
	private String resourceString;

	public OlaMundoTest() {
		super("course.examples.helloworld", OlaMundo.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();
		mView = (TextView) mActivity
				.findViewById(curso.exemplos.olamundo.R.id.textview);
		resourceString = mActivity
				.getString(curso.exemplos.olamundo.R.string.string_ola);
	}

	public void testPreconditions() {
		assertNotNull(mView);
	}

	public void testText() {
	      assertEquals(resourceString,(String)mView.getText());
	    }
	
	
}
