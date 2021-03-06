/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzer;

/**
 *
 * @author Cat Morgan
 */
/**
 * Base class for errors generated by the parts of the compiler.
 */
public abstract class CompilerError extends Exception
{
   /** The type of error.  New types should be added to the enumeration
    * as the compiler generates new errors.
    */
   public enum Type {BAD_COMMENT, ILLEGAL_CHARACTER, LONGNUMBER,
   UNTERMINATED_COMMENT, LONGIDENTIFIER, MISMATCH, UNEXPECTED};

   /** The type of error represented by this object.  This field is declared
    * as final and must be set in the constructor.
    */
   protected final Type errorType;

   public CompilerError(Type errorType)
   {
      super("Unknown error");
      this.errorType = errorType;
   }

   public CompilerError(Type errorType, String message)
   {
      super(message);
      this.errorType = errorType;
   }

}
