package noncommerce.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Xlsx_write {


		
		public static Properties getPropertyObject() throws IOException {

			FileInputStream fp = new FileInputStream("C:\\Users\\Jnirujyogi\\eclipse-workspace\\nopcommerce\\src\\main\\resources\\config.properties");

			Properties prop = new Properties();

			prop.load(fp);

			return prop;

			}
		
		public String getUrl() throws Exception {
			return getPropertyObject().getProperty("url");
		}

		public CharSequence getFirstname() throws Exception {
		return getPropertyObject().getProperty("firstname");
	}

	public CharSequence getLastname() throws Exception {
			return getPropertyObject().getProperty("lastname");
		}

	public CharSequence getEmail() throws Exception {
		return getPropertyObject().getProperty("email");
	}

	public CharSequence getCompanyname() throws Exception {
		return getPropertyObject().getProperty("companyname");
	}

	public CharSequence getpassword() throws Exception {
		return getPropertyObject().getProperty("password");
	}

	public CharSequence getconformpassword() throws Exception {
		return getPropertyObject().getProperty("conformpassword");
	}

	public CharSequence getpreemail() throws Exception {
		return getPropertyObject().getProperty("preemail");
	}

	public CharSequence getprepassword() throws Exception {
		return getPropertyObject().getProperty("prepassword");
	
	}

}