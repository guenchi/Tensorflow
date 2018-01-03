(library (tensorflow tensorflow)
  (export
    TF_Version)
  (import (scheme))

  (define init (load-shared-object "libtensorflow.so"))

  ;;TF_CAPI_EXPORT extern const char* TF_Version();
  (define TF_Version
    (foreign-procedure "TF_Version" ()
      string))
)