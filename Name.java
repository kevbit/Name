
/**
 * Takes a person's name and returns information about it.
 *
 * @author Kevin Lo
 * @version 2020-09-29
 */
public class Name
{
    // instance variables - replace the example below with your own
    private String name;
    public static final int ZERO = 0;

    /**
     * Constructor for objects of class Name
     * @param fullName a person's full name
     */
    public Name(String fullName)
    {
        name = fullName;

    }

    /**
     * Gets the name string
     *
     * @return the name string
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the number of consonants in the name.
     *
     * @return the number of consonants in the name
     */
    public int consonants()
    {
        name = name.toLowerCase();
        int nonConsonantCounter = 0;
        for (int i = 0; i < name.length(); i++)
        {
            if (name.substring(i, i + 1).contains("a"))
            {
                nonConsonantCounter++;
            }

            else if (name.substring(i, i + 1).contains("e"))
            {
                nonConsonantCounter++;

            }
            else if (name.substring(i, i + 1).contains("i"))
            {
                nonConsonantCounter++;

            }
            else if (name.substring(i, i + 1).contains("o"))
            {
                nonConsonantCounter++;

            }
            else if (name.substring(i, i + 1).contains("u"))
            {
                nonConsonantCounter++;

            }
            else if (name.substring(i, i + 1).contains(" "))
            {
                nonConsonantCounter++;

            }
            else if (name.substring(i, i + 1).contains("-"))
            {
                nonConsonantCounter++;

            }
            else
            {
                nonConsonantCounter = nonConsonantCounter;
            }

        }
        return name.length() - nonConsonantCounter;

    }

    /**
     * Gets the initials of the name.
     *
     * @return the initials of the name
     */
    public String initials()
    {
        String firstInitial = name.substring(0, 1);
        String remainingInitials = "";
        int index = 0;
        int lastSpaceIndex = name.indexOf(" ", 0);

        while(index < name.length())
        {
            if(index == lastSpaceIndex)
            {
                remainingInitials = remainingInitials + name.substring(index + 1, index + 2);
                lastSpaceIndex = name.indexOf(" ", index + 1);

            }
            else
            {
                index = index;
            }

            index++;
        }

        return firstInitial + remainingInitials;
    }

}
