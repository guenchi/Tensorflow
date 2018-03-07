(import (tensorflow tensorflow))

(define (main)
  (printf "Hello from TensorFlow C library version ~a\n" (TF_Version)))

(main)