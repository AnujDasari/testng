package org.testng.internal.annotations;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DefaultAnnotationTransformer extends IgnoreListener implements IAnnotationTransformer {

  @Override
  public void transform(
      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
    super.transform(annotation, testClass, testConstructor, testMethod);
  }

  @Override
  public void transform(
      ITestAnnotation annotation, Class testClass, Constructor cons, Method tm, Class<?> clazz) {
    super.transform(annotation, testClass, cons, tm, clazz);
  }
}
