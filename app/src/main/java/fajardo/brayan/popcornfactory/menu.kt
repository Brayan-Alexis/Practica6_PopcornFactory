package fajardo.brayan.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {

    var adapter: AdapterPeliculas? = null
    var adapter2: AdapterSeries? = null
    var peliculas = ArrayList<Pelicula>()
    var series = ArrayList<Serie>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        cargarPeliculas()
        cargarSeries()
        
        adapter = AdapterPeliculas(this, peliculas)
        grid_movies.adapter = adapter

        adapter2 = AdapterSeries(this, series )
        grid_series.adapter = adapter2


    }

    fun cargarSeries(){
        series.add(Serie( "Dr. House", R.drawable.drhouse, R.drawable.househeader, "The series follows the life of anti-social, pain killer addict, witty and arrogant medical doctor Gregory\n" +
                "House (Hugh Laurie) with only half a muscle in his right leg. He and his team of medical doctors try\n" +
                "to cure complex and rare diseases from very ill ordinary people in the United States of America."))
        series.add(Serie( "Smallville", R.drawable.smallville, R.drawable.smallvilleheader, "The numerous miraculous rescues by the local wonder boy Clark have aroused suspicions amongst\n" +
                "colonials of Smallville. Interestingly, the boy has managed to downplay his acts of various heroic\n" +
                "egresses in the past. They say head's either too fast or has a penchant for finding trouble. He was\n" +
                "found by Martha and Jonathan Kent on the day of the Meteor Shower, and subsequently adopted.\n" +
                "Clark's friend Lex Luthor, the only heir of Luthorcorp, has been secretly investigating grounds for\n" +
                "Clark's outlandish valor. However, on the face of it, Clark just seems a normal boy whoos slightly\n" +
                "more secretive than usual."))
        series.add(Serie( "Dr. Who", R.drawable.drwho, R.drawable.drwhoheader, "Traveling across time and space, the immortal time-lord known as; The Doctor's; travels across the\n" +
                "universe with his many companions and his loyal shape-shifting space-ship: The TARDIS. The\n" +
                "Doctor faces many threats across many generations: from The Daleks, The Cybermen and his time-\n" +
                "lord adversary The Master to the sinister Davros, creator of The Daleks."))
        series.add(Serie( "Bones", R.drawable.bones, R.drawable.bonesheader, "Dr. Temperance Brennan is a brilliant, but lonely, anthropologist whom is approached by an\n" +
                "ambitious FBI agent, named Seely Booth, to help the bureau solve a series of unsolved crimes by\n" +
                "identifying the long-dead bodies of missing persons by their bone structure. But both Agent Booth\n" +
                "\n" +
                "and Dr. Brennan and her team come up again a variety of interference from red tape, corruption,\n" +
                "and local noncooperation."))
        series.add(Serie( "Suits", R.drawable.suits, R.drawable.suitsheader, "While running from a drug deal gone bad, brilliant young college dropout Mike Ross slips into a job\n" +
                "interview with one of New York City's best legal closers, Harvey Specter. Tired of cookie-cutter law-\n" +
                "school grads, Harvey takes a gamble by hiring Mike on the spot after recognizing his raw talent and\n" +
                "photographic memory. Mike and Harvey are a winning team. Although Mike is a genius, he still has\n" +
                "a lot to learn about law; and while Harvey might seem like an emotionless, cold-blooded shark,\n" +
                "Mike's sympathy and concern for their cases and clients will help remind Harvey why he went into\n" +
                "law in the first place. Mike's other allies in the office include the firm's best paralegal Rachel and\n" +
                "Harvey's no-nonsense assistant Donna. Proving to be an irrepressible duo and invaluable to the\n" +
                "practice, Mike and Harvey must keep their secret from everyone including managing partner\n" +
                "Jessica and Harvey's archnemesis Louis, who seems intent on making Mike's life as difficult as\n" +
                "possible."))
        series.add(Serie( "Friends", R.drawable.friends, R.drawable.friendsheader, "Rachel Green, Ross Geller, Monica Geller, Joey Tribbiani, Chandler Bing and Phoebe Buffay are\n" +
                "six 20 something year-olds, living off of one another in the heart of New York City. Over the course\n" +
                "of ten years, this average group of buddies goes through massive mayhem, family trouble, past and\n" +
                "future romances, fights, laughs, tears and surprises as they learn what it really means to be a\n" +
                "friend."))
    }

    fun cargarPeliculas() {
        peliculas.add(
            Pelicula(
                "Big Hero 6",
                R.drawable.bighero6,
                R.drawable.headerbighero6,
                "When a devastating event befalls the city of San Fransokyo and catapults Hiro into the\n" +
                        "midst of danger, he turns to Baymax and his close friends adrenaline junkie Go Go\n" +
                        "Tomago, neatnik Wasabi, chemistry whiz Honey Lemon and fanboy Fred. Determined to\n" +
                        "uncover the mystery, Hiro transforms his friends into a band of high-tech heroes called\n" +
                        "Big Hero 6."
            )
        )
        peliculas.add(
            Pelicula(
                "Leap year",
                R.drawable.leapyear,
                R.drawable.leapyearheader,
                "A woman who has an elaborate scheme to propose to her boyfriend on Leap Day, an Irish\n" +
                        "tradition which occurs every time the date February 29 rolls around, faces a major setback\n" +
                        "when bad weather threatens to derail her planned trip to Dublin. With the help of an\n" +
                        "innkeeper, however, her cross-country odyssey just might result in her getting engaged."
            )
        )
        peliculas.add(
            Pelicula(
                "Men in Black",
                R.drawable.mib,
                R.drawable.mibheader,
                "Based off of the comic book. Unbeknownst to other people, there is a private agency code\n" +
                        "named MiB. This agency is some kind of extra terrestrial surveillance corporation. Then,\n" +
                        "one of the agency's finest men only going by the name (Tommy Lee Jones) , is\n" +
                        "recruiting for a new addition to the agency. He has chosen James Edwards (Will Smith) of\n" +
                        "the N.Y.P.D. Then, one day, a flying saucer crashes into Earth. This was an alien a part of\n" +
                        "the race. He takes the body of a farmer (Vincent Donofrio) and heads to New York.\n" +
                        "He is searching for a super energy source called; The Galaxy;. Now, Agents J and K must\n" +
                        "stop the bug before it can escape with the galaxy."
            )
        )
        peliculas.add(
            Pelicula(
                "Toy Story",
                R.drawable.toystory,
                R.drawable.toystoryheader,
                "Toy Story is about the secret life of toys; when people are not around. When Buzz\n" +
                        "Lightyear, a space-ranger, takes Woody's place as Andy's favorite toy, Woody doesn't like\n" +
                        "the situation and gets into a fight with Buzz. Accidentaly Buzz falls out the window and\n" +
                        "Woody is accused by all the other toys of having killed him. He has to go out of the house\n" +
                        "to look for him so that they can both return to Andys room. But while on the outside they\n" +
                        "get into all kind of trouble while trying to get home."
            )
        )
        peliculas.add(
            Pelicula(
                "Inception",
                R.drawable.inception,
                R.drawable.inceptionheader,
                "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing\n" +
                        "valuable secrets from deep within the subconscious during the dream state, when the\n" +
                        "mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this\n" +
                        "treacherous new world of corporate espionage, but it has also made him an international\n" +
                        "fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at\n" +
                        "redemption. One last job could give him his life back but only if he can accomplish the\n" +
                        "impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to\n" +
                        "pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it\n" +
                        "could be the perfect crime. But no amount of careful planning or expertise can prepare the\n" +
                        "team for the dangerous enemy that seems to predict their every move. An enemy that only\n" +
                        "Cobb could have seen coming."
            )
        )
        peliculas.add(
            Pelicula(
                "1917",
                R.drawable.guerra,
                R.drawable.guerraheader,
                "British trenches somewhere in France. World war has been going on for the third year,\n" +
                        "heroic illusions have dissipated; general mood - boredom and fatigue. Stuff the belly,\n" +
                        "sleep, return home to Christmas Eve. On another quiet day, when nothing happens, two\n" +
                        "young soldiers, Blake and Schofield, are summoned to the general, who instructs them to\n" +
                        "send an important message to Colonel MacKenzie in the Second Devonshire Battalion,\n" +
                        "whose telephone connection was cut off by the enemy."
            )
        )

    }
}