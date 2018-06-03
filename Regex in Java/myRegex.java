import java.util.Arrays;
import java.util.regex.*; //Regex kütüphanesi

/*
    util.regex.Pattern – Used for defining patterns
    matches()­­­ It is used to check if the whole text matches a pattern. Its output is boolean.
    compile()– Used to create a pattern object by compiling a given string that may contain regular expressions. Input may also contains flags like Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, .. etc (See this for details).
    split()– It is used to split a text into multiple strings based on a delimiter pattern.


    util.regex.Matcher – Used for performing match operations on text using patterns
    find() –It is mainly used for searching multiple occurrences of the regular expressions in the text.
    start() – It is used for getting the start index of a match that is being found using find() method.
    end() –It is used for getting the end index of a match that is being found using find() method. It returns index of character next to last matching character

    PatternSyntaxException– Used for indicating syntax error in a regular expression pattern
*/

public class myRegex {
    public static void main(String [] args){

        String name="Sibel";
        String nameRegex="[A-Za-z]";//Si ile başlıyor mu?

        String city="Antalya";
        String cityRegex="ya$";//şehirin sonu "ya" ile mi bitiyor?

        String phone="905680000680";
        String phoneRegex="[0-9]{12}";//telefon numarası mı ?
        String phoneTRregex="90[0-9]{10}";//telefon türkiyeden mi?

        String carPlate="68D1903";
        String carPlateRegex="(68)[DFR]1903";//Belirli bir bölgenin plaka sorgusunu yaptık.
        //Araba Aksaraydan mı? Plaka D ,F veya R içeriyor mu ? sonu 1903 ile mi bitiyor.

        System.out.println(Pattern.matches(carPlateRegex,carPlate));

        if (Pattern.matches(phoneTRregex, phone)){
            System.out.println("TR'ye selamlar.");
        }
        else {
            System.out.println("TR'den değilsin.");
        }

        //Pattern alanından da variable oluşturup compile metoduyla regex atayabiliriz.
        Pattern phonePattern=Pattern.compile("68");

        //Matcher alanıyla variable oluşturup regex'imiz phone string'inin içinde var olup olmadığını kontrol ediyoruz.
        Matcher phoneMatcher=phonePattern.matcher(phone);

        //find metodu string içinde regex arar.
        while(phoneMatcher.find()){
            //start metodu regexin başlangıcını end metodu ise bitişini döndürür.
            System.out.println("Regex " +phoneMatcher.start()+"-"+phoneMatcher.end()+" arasında bulundu.");
        }


        String adress ="Turkiye@Aksaray@Merkez ";

        Pattern addressPattern=Pattern.compile("@");

        String [] address=new String[3];
        address=addressPattern.split(adress);

        for (String tmp:address) {
            System.out.println(tmp);
        }





    }
}














/*

Regex       Meaning/Sample

*           repeats the previous expression 0 or more times. "Ah*" matches "Ahhh.." , "12*3" matches "13","12223".

?           matches 0 or 1 of the previous.makes the previous item optional."Ah?" matches "A" or "Ah","ma?ke" matches "mke","make"

+           repeats the previous expression 1 or more times."Ah+" matches "Ah" , "Ahhhhhhhh",vs.

\           used to escape a special character and turn it into an ordinary character."a\*c" matches "a*c".

.           matches any character except newline "\n" . "do." matches "dog","door".

()          grouping of characters or expression. (ak) matches "make","fake"."mon" matches "monkey","monday".

-           specifies a range of characters to match."a[0-9]c" matches "a1c","a6c".

[]          matches a range of characters. [a-zA-Z] matches any letter."[cbf]ar" matches "car" ,"bar", "far".

|           matches previous or next character or group of character."(Mon)|(Tues)day" matches "Monday" or "Tuesday".

{}          matches a specified number of occurness of the previous.
            [0-9]{3} matches "315" or "498" but not "12" or "6".must be 3 digit.
            [0-9]{2,4} matches 2 ,3 or 4 digit numbers.
            [0-9]{4,}  matches 4 or more digit numbers.
            "ab{3,5}c" matches "abbbc","abbbbc" or "abbbbbc".


^           matches from the beginning of the string. "^http" matches strings that begin http such as url.

$           matches from the end of the string. ing$ matches "Loving" but not "ingles".

[^..]       matches any character except for those that are defined in the bracket."a[^b]c" matches "aec","acc" but not "abc".

\b..\b      matches a word within the boundary."\bLive\b" matches Live in "Long Live The King".

(?:..)      non-capturing group .(a)b(?:c) captures 'c' but only groups of 'c'.

\0          null character

\a          matches a bell or alarm.

\b          word boundary.

\B          non word boundary.

\d          matches any decimal digit.

\D          matches any non-digit.

\e          matches an escape.

\r          matches a carriage return.

\t          matches a tab.

\s          matches space ."a\sc" matches "a c".

\S          matches non-space.

\v          matches a vertical tab.

\w          matches any one word character [a-zA-Z_0-9]

\W          matches any non-word character

\Z          end of string

\A          start of string

\<          start of word

\>          end of word

\x          hexadecimal digit

\O          octal digit



Assertions

?=              Lookahead assertion.

?!              Negative lookahead.

?<=             Lookbehind assertion.

?!= or ?<!      negative lookbehind.

?>              Once-only Subexpression

?()             Condition(if then)

?()|            Condition(if then else)

?#              Comment



POSIX

[:upper:]       upper case letters

[:lower:]       lower case letters

[:alpha:]       all letters

[:alnum:]       digits and letters

[:digit:]       digits

[:xdigit:]      hex digits

[:punct:]       punctuation and symbols

[:blank:]       space and tab

[:space:]       all whitespace characters, including line breaks

[:cntrl:]       control characters

[:graph:]       visible characters

[:print:]       visible characters and spaces (anything except control characters)

[:word:]        digits ,letters,underscore

In Java, [:punct:]  becomes \p{Punct} and all of them become same \p{word with upper case first letter }



Regular Expression Flags
Outside the regular expression (at the end) flags can be used to help with the pattern matching.

i       Ignore the case(upper or lower)
m       Multi-lines match
s       Match new lines
x       allow space and comments
J       Duplicate group names allowed
U       Ungreedy match



*/
