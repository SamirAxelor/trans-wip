package com.axelor.studio.service;
import com.axelor.apps.studio.db.Parameter;
import com.axelor.apps.studio.db.Transformation;
import java.util.List;
import java.util.Optional;


public interface TransformationService {

  boolean validateUniqueNameInLibrary(Transformation transformation);

  List<Parameter> removeMatchingPlaceholdersAndReturnUnusedParameters(List<Parameter> parameters, List<String> placeholders);

  List<String> getPlaceholders(String groovyTemplate);


  Optional<String> analyzeGroovyTemplateSyntax(String groovyTemplate);
}
