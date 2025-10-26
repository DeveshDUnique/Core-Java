package Exceptions;


//unchecked exception
public class InvalidDateException extends RuntimeException
{
    private String fieldName;
    private int fieldValue;


    public InvalidDateException(String message)
    {
        super(message);

    }

    public InvalidDateException(String fieldname, int fieldvalue)
    {
        this.fieldName = fieldname;
        this.fieldValue = fieldvalue;

    }

    @Override
    public String toString()
    {
        return "InvalidDateException [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]";
    }


}
