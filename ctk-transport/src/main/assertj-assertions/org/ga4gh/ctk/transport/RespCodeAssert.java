package org.ga4gh.ctk.transport;

import org.assertj.core.api.AbstractAssert;

/**
 * {@link RespCode} specific assertions - Generated by CustomAssertionGenerator.
 */
public class RespCodeAssert extends AbstractAssert<RespCodeAssert, RespCode> {

  /**
   * Creates a new <code>{@link RespCodeAssert}</code> to make assertions on actual RespCode.
   * @param actual the RespCode we want to make assertions on.
   */
  public RespCodeAssert(RespCode actual) {
    super(actual, RespCodeAssert.class);
  }

  /**
   * An entry point for RespCodeAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myRespCode)</code> and get specific assertion with code completion.
   * @param actual the RespCode we want to make assertions on.
   * @return a new <code>{@link RespCodeAssert}</code>
   */
  public static RespCodeAssert assertThat(RespCode actual) {
    return new RespCodeAssert(actual);
  }

  /**
   * Verifies that the actual RespCode's code is equal to the given one.
   * @param code the given code to compare the actual RespCode's code to.
   * @return this assertion object.
   * @throws AssertionError - if the actual RespCode's code is not equal to the given one.
   */
  public RespCodeAssert hasCode(int code) {
    // check that actual RespCode we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting code of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualCode = actual.getCode();
    if (actualCode != code) {
      failWithMessage(assertjErrorMessage, actual, code, actualCode);
    }

    // return the current assertion for method chaining
    return this;
  }

}
