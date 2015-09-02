package org.ga4gh.models;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link ReferenceSet} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ReferenceSetAssert extends AbstractAssert<ReferenceSetAssert, ReferenceSet> {

  /**
   * Creates a new <code>{@link ReferenceSetAssert}</code> to make assertions on actual ReferenceSet.
   * @param actual the ReferenceSet we want to make assertions on.
   */
  public ReferenceSetAssert(ReferenceSet actual) {
    super(actual, ReferenceSetAssert.class);
  }

  /**
   * An entry point for ReferenceSetAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myReferenceSet)</code> and get specific assertion with code completion.
   * @param actual the ReferenceSet we want to make assertions on.
   * @return a new <code>{@link ReferenceSetAssert}</code>
   */
  public static ReferenceSetAssert assertThat(ReferenceSet actual) {
    return new ReferenceSetAssert(actual);
  }

  /**
   * Verifies that the actual ReferenceSet's assemblyId is equal to the given one.
   * @param assemblyId the given assemblyId to compare the actual ReferenceSet's assemblyId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's assemblyId is not equal to the given one.
   */
  public ReferenceSetAssert hasAssemblyId(String assemblyId) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting assemblyId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualAssemblyId = actual.getAssemblyId();
    if (!Objects.areEqual(actualAssemblyId, assemblyId)) {
      failWithMessage(assertjErrorMessage, actual, assemblyId, actualAssemblyId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's classSchema is equal to the given one.
   * @param classSchema the given classSchema to compare the actual ReferenceSet's classSchema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's classSchema is not equal to the given one.
   */
  public ReferenceSetAssert hasClassSchema(org.apache.avro.Schema classSchema) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting classSchema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualClassSchema = actual.getClassSchema();
    if (!Objects.areEqual(actualClassSchema, classSchema)) {
      failWithMessage(assertjErrorMessage, actual, classSchema, actualClassSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's description is equal to the given one.
   * @param description the given description to compare the actual ReferenceSet's description to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's description is not equal to the given one.
   */
  public ReferenceSetAssert hasDescription(String description) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting description of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualDescription = actual.getDescription();
    if (!Objects.areEqual(actualDescription, description)) {
      failWithMessage(assertjErrorMessage, actual, description, actualDescription);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's id is equal to the given one.
   * @param id the given id to compare the actual ReferenceSet's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's id is not equal to the given one.
   */
  public ReferenceSetAssert hasId(String id) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's isDerived is equal to the given one.
   * @param isDerived the given isDerived to compare the actual ReferenceSet's isDerived to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's isDerived is not equal to the given one.
   */
  public ReferenceSetAssert hasIsDerived(Boolean isDerived) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting isDerived of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Boolean actualIsDerived = actual.getIsDerived();
    if (!Objects.areEqual(actualIsDerived, isDerived)) {
      failWithMessage(assertjErrorMessage, actual, isDerived, actualIsDerived);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's md5checksum is equal to the given one.
   * @param md5checksum the given md5checksum to compare the actual ReferenceSet's md5checksum to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's md5checksum is not equal to the given one.
   */
  public ReferenceSetAssert hasMd5checksum(String md5checksum) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting md5checksum of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualMd5checksum = actual.getMd5checksum();
    if (!Objects.areEqual(actualMd5checksum, md5checksum)) {
      failWithMessage(assertjErrorMessage, actual, md5checksum, actualMd5checksum);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's ncbiTaxonId is equal to the given one.
   * @param ncbiTaxonId the given ncbiTaxonId to compare the actual ReferenceSet's ncbiTaxonId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's ncbiTaxonId is not equal to the given one.
   */
  public ReferenceSetAssert hasNcbiTaxonId(Integer ncbiTaxonId) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting ncbiTaxonId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Integer actualNcbiTaxonId = actual.getNcbiTaxonId();
    if (!Objects.areEqual(actualNcbiTaxonId, ncbiTaxonId)) {
      failWithMessage(assertjErrorMessage, actual, ncbiTaxonId, actualNcbiTaxonId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's schema is equal to the given one.
   * @param schema the given schema to compare the actual ReferenceSet's schema to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's schema is not equal to the given one.
   */
  public ReferenceSetAssert hasSchema(org.apache.avro.Schema schema) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting schema of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    org.apache.avro.Schema actualSchema = actual.getSchema();
    if (!Objects.areEqual(actualSchema, schema)) {
      failWithMessage(assertjErrorMessage, actual, schema, actualSchema);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's sourceAccessions contains the given String elements.
   * @param sourceAccessions the given elements that should be contained in actual ReferenceSet's sourceAccessions.
   * @return this assertion object.
   * @throws AssertionError if the actual ReferenceSet's sourceAccessions does not contain all given String elements.
   */
  public ReferenceSetAssert hasSourceAccessions(String... sourceAccessions) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (sourceAccessions == null) failWithMessage("Expecting sourceAccessions parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getSourceAccessions(), sourceAccessions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's sourceAccessions contains <b>only<b> the given String elements and nothing else in whatever order.
   * @param sourceAccessions the given elements that should be contained in actual ReferenceSet's sourceAccessions.
   * @return this assertion object.
   * @throws AssertionError if the actual ReferenceSet's sourceAccessions does not contain all given String elements.
   */
  public ReferenceSetAssert hasOnlySourceAccessions(String... sourceAccessions) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (sourceAccessions == null) failWithMessage("Expecting sourceAccessions parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getSourceAccessions(), sourceAccessions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet's sourceAccessions does not contain the given String elements.
   *
   * @param sourceAccessions the given elements that should not be in actual ReferenceSet's sourceAccessions.
   * @return this assertion object.
   * @throws AssertionError if the actual ReferenceSet's sourceAccessions contains any given String elements.
   */
  public ReferenceSetAssert doesNotHaveSourceAccessions(String... sourceAccessions) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (sourceAccessions == null) failWithMessage("Expecting sourceAccessions parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getSourceAccessions(), sourceAccessions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ReferenceSet has no sourceAccessions.
   * @return this assertion object.
   * @throws AssertionError if the actual ReferenceSet's sourceAccessions is not empty.
   */
  public ReferenceSetAssert hasNoSourceAccessions() {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have sourceAccessions but had :\n  <%s>";
    
    // check
    if (actual.getSourceAccessions().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getSourceAccessions());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual ReferenceSet's sourceURI is equal to the given one.
   * @param sourceURI the given sourceURI to compare the actual ReferenceSet's sourceURI to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ReferenceSet's sourceURI is not equal to the given one.
   */
  public ReferenceSetAssert hasSourceURI(String sourceURI) {
    // check that actual ReferenceSet we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting sourceURI of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualSourceURI = actual.getSourceURI();
    if (!Objects.areEqual(actualSourceURI, sourceURI)) {
      failWithMessage(assertjErrorMessage, actual, sourceURI, actualSourceURI);
    }

    // return the current assertion for method chaining
    return this;
  }









}
