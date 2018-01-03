(load-shared-object "libtensorflow.so")

;;TF_CAPI_EXPORT extern const char* TF_Version();
(define TF_Version
  (foreign-procedure "TF_Version" ()
    string))

(define (main)
  (printf "Hello from TensorFlow C library version ~a\n" (TF_Version)))

(main)