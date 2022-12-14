# play-api-docs

## ジェネレーターを実装する

OpenAPITools/openapi-generator: OpenAPI Generator allows generation of API client libraries (SDK generation), server stubs, documentation and configuration automatically given an OpenAPI Spec (v2, v3) : https://github.com/OpenAPITools/openapi-generator

openapi-generatorをフォークする。

```bash
git clone フォークしたリポジトリのURL

cd リポジトリ名

./new.sh -n scala-play-custom -s
# Creating modules/openapi-generator/src/main/java/org/openapitools/codegen/languages/ScalaPlayCustomServerCodegen.java
# Creating modules/openapi-generator/src/main/resources/scala-play-custom/README.mustache
# Creating modules/openapi-generator/src/main/resources/scala-play-custom/model.mustache
# Creating modules/openapi-generator/src/main/resources/scala-play-custom/api.mustache
# Creating bin/configs/scala-play-custom-petstore-new.yaml
# Finished.
```

### 参考

- Create a New Generator : https://openapi-generator.tech/docs/new-generator/
