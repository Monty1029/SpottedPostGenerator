import java.util.*;

public class WordBank {
	
	private GUI g;
	private boolean swap;
	
	public WordBank() {
		g = new GUI(this);
		swap = false;
	}
	
	private enum Gender {
		DUDE("dude"), BABE("babe"), HOTTIE("hottie"), GUY("guy"), GIRL("girl"), CUTIE("cutie");
		
		private String gender;
		
		private Gender(String gender) {
			this.gender = gender;
		}
	};
	
	private enum Location {
		AA("architecture building"), AC("athletics"), AH("Alumni Hall"), AP("Azrieli Pavillion"), AT("Azrieli Theatre"),
		CB("Canal building"), DH("Dundas House"), DT("Dunton Tower"), FH("Fieldhouse"), FR("Frontenac House"),
		GH("Glengarry House"), GY("the gym"), HC("HCI building"), HP("Herzberg"), LA("Loeb building"), LE("Leeds House"),
		LS("Life Sciences building"), LX("Lennox and Addington House"), MC("Minto centre"), ME("Mackenzie building"),
		ML("the library"), PA("Paterson Hall"), PG("the parking garage"), PH("Prescott House"), RB("River Building"),
		RH("Renfrew House"), RU("Russel House"), SA("Southam Hall"), SC("Steacie Building"), SH("Stormont House"),
		SP("St. Patrick's building"), TB("Tory Building"), UC("University Centre"), VS("VSIM"),
		TIM("Timmies"), SB("Starbucks"), SW("Subway"), CAF("res caf");
		
		private String location;
		
		private Location(String location) {
			this.location = location;
		}
	};
	
	private enum Course {
		ECOR("ECOR"), ECON("ECON"), SYSC("SYSC"), ELEC("ELEC"), MATH("math"), MAAE("MAAE"), STAT("stats"), AERO("AERO"),
		CHEM("chemistry"), BIOL("biology"), CCDP("CCDP"), CGSC("cognitive science"), COMP("COMP"), ENGL("English"),
		BUSI("business"), PHYS("physics"), LING("linguistics"), LAWS("law"), NEUR("neuroscience"), PSYC("psychology"),
		PSCI("political science"), RELI("regions"), SOCI("sociology"), WGST("women's studies"), FILM("film"), MUSI("music"),
		HIST("history");
		
		private String course;
		
		private Course(String course) {
			this.course = course;
		}
	};
	
	private enum Color {
		RED("red"), GREEN("green"), BLUE("blue"), PINK("pink"), YELLOW("yellow"), BROWN("brown"), PURPLE("purple"), 
		ORANGE("orange"), BLACK("black"), GREY("grey");
		
		private String color;
		
		private Color(String color) {
			this.color = color;
		}
	};
	
	private enum Object {
		HAIR("hair"), BAG("bag"), SHIRT("shirt"), JACKET("jacket"), HAT("hat");
		
		private String object;
		
		private Object(String object) {
			this.object = object;
		}
	};
	
	private enum Phrase {
		MARRY("marry me please"), DATE("please go out with me"), BAE("be my bae"), CUTE("you're cute"),
		NUMBER("can I get your number"), HOOK("let's hook up");
		
		private String phrase;
		
		private Phrase(String phrase) {
			this.phrase = phrase;
		}
	};
	
	private enum Poster {
		GIRL("girl"), GUY("guy"), DUDE("dude");
		
		private String poster;
		
		private Poster(String poster) {
			this.poster = poster;
		}
	};
	
	public void generate() {
		Random random = new Random();
		String randomGender = Gender.values()[random.nextInt(Gender.values().length)].gender;
		String randomLocation = Location.values()[random.nextInt(Location.values().length)].location;
		String randomCourse = Course.values()[random.nextInt(Course.values().length)].course;
		String randomColor = Color.values()[random.nextInt(Color.values().length)].color;
		String randomObject = Object.values()[random.nextInt(Object.values().length)].object;
		String randomPhrase = Phrase.values()[random.nextInt(Phrase.values().length)].phrase;
		String randomPoster = Poster.values()[random.nextInt(Poster.values().length)].poster;
		if (swap) {
			generateV1(randomGender, randomLocation, randomColor, randomObject, randomPhrase, randomPoster);
		}
		else {
			generateV2(randomGender, randomCourse, randomColor, randomObject, randomPhrase, randomPoster);
		}
	}
	
	public void generateV1(String randomGender, String randomLocation, String randomColor, String randomObject, 
			String randomPhrase, String randomPoster) {
		g.getTextArea().setText("To the " + randomGender + " at " + randomLocation + " with the \n" + randomColor + " "
				+ randomObject + ", " + randomPhrase + "\n      - The shy " + randomPoster + " with the " + randomColor
				+ " " + randomObject);
		swap = false;
	}
	
	public void generateV2(String randomGender, String randomCourse, String randomColor, String randomObject, 
			String randomPhrase, String randomPoster) {
		g.getTextArea().setText("To the " + randomGender + " in my " + randomCourse + " class with the \n" + randomColor + " "
				+ randomObject + ", " + randomPhrase + "\n      - The shy " + randomPoster + " with the " + randomColor
				+ " " + randomObject);
		swap = true;
	}
	
	public static void main(String[] args) {
		WordBank wb = new WordBank();
	}
}
