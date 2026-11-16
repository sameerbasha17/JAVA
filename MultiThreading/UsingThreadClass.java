package JAVA.MultiThreading;

/*class Test1 extends Thread
{
    public void run()     // Should override 
    {
        int i = 1;
        while(true)
        {
            System.out.println(i +  " Hello");
            i++;
        }
    }
}


public class UsingThreadClass 
{
    public static void main(String[] as) 
    {
        Test1 obj = new Test1();
        obj.start();

        int j = 1;
        while(true)
        {
            System.out.println(j + " World");
            j++;
        }
    }
}
*/

public class UsingThreadClass extends Thread
{
    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] as)
    {
        UsingThreadClass obj = new UsingThreadClass();
        obj.start();

        int j = 1;
        while(true)
        {
            System.out.println(j + " World");
            j++;
        }
    }
}

/*
Output : (from middle)
========

484 Hello
485 Hello
486 Hello
487 Hello
488 Hello
489 Hello
490 Hello
491 Hello
492 Hello
493 Hello
494 Hello
495 Hello
496 Hello
497 Hello
498 Hello
499 Hello
500 Hello
501 Hello
502 Hello
503 Hello
504 Hello
505 Hello
506 Hello
507 Hello
508 Hello
509 Hello
510 Hello
511 Hello
512 Hello
513 Hello
514 Hello
515 Hello
516 Hello
517 Hello
518 Hello
519 Hello
520 Hello
521 Hello
522 Hello
523 Hello
524 Hello
525 Hello
526 Hello
527 Hello
528 Hello
529 Hello
530 Hello
531 Hello
532 Hello
533 Hello
534 Hello
535 Hello
536 Hello
537 Hello
538 Hello
539 Hello
540 Hello
541 Hello
542 Hello
543 Hello
544 Hello
545 Hello
546 Hello
547 Hello
548 Hello
549 Hello
550 Hello
551 Hello
552 Hello
553 Hello
554 Hello
555 Hello
556 Hello
557 Hello
558 Hello
559 Hello
560 Hello
381 World
382 World
383 World
384 World
385 World
561 Hello
386 World
387 World
388 World
389 World
390 World
391 World
392 World
393 World
394 World
395 World
396 World
397 World
398 World
399 World
400 World
401 World
402 World
403 World
404 World
405 World
406 World
562 Hello
563 Hello
564 Hello
565 Hello
566 Hello
567 Hello
568 Hello
569 Hello
570 Hello
571 Hello
572 Hello
573 Hello
574 Hello
575 Hello
576 Hello
577 Hello
578 Hello
579 Hello
580 Hello
581 Hello
582 Hello
583 Hello
584 Hello
585 Hello
586 Hello
587 Hello
588 Hello
589 Hello
590 Hello
591 Hello
592 Hello
593 Hello
594 Hello
407 World
595 Hello
596 Hello
597 Hello
598 Hello
599 Hello
600 Hello
601 Hello
602 Hello
603 Hello
604 Hello
605 Hello
606 Hello
607 Hello
608 Hello
609 Hello
610 Hello
611 Hello
612 Hello
613 Hello
614 Hello
615 Hello
616 Hello
617 Hello
618 Hello
619 Hello
408 World
409 World
410 World
411 World
412 World
413 World
414 World
415 World
416 World
620 Hello
621 Hello
622 Hello
623 Hello
624 Hello
625 Hello
626 Hello
627 Hello
628 Hello
629 Hello
630 Hello
631 Hello
632 Hello
633 Hello
634 Hello
635 Hello
636 Hello
637 Hello
638 Hello
639 Hello
640 Hello
641 Hello
642 Hello
643 Hello
644 Hello
645 Hello
646 Hello
647 Hello
648 Hello
649 Hello
650 Hello
651 Hello
652 Hello
653 Hello
654 Hello
655 Hello
656 Hello
657 Hello
658 Hello
659 Hello
660 Hello
661 Hello
662 Hello
663 Hello
664 Hello
665 Hello
666 Hello
667 Hello

*/