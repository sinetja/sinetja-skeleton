Skeleton for creating your new project based on
`Sinetja <https://github.com/sinetja/sinetja>`_.

See also:

* `Sinetja-Skeleton8 <https://github.com/sinetja/sinetja-skeleton8>`_:
  If you want to use Java 8 with its lambda syntax.
* `Sinetja-Scaleton <https://github.com/sinetja/sinetja-scaleton>`_:
  If you want to use Scala.

Run in development mode
~~~~~~~~~~~~~~~~~~~~~~~

::

  sbt/sbt run

Create project
~~~~~~~~~~~~~~

To create Eclipse project:

::

  sbt/sbt eclipse

To create IntelliJ project:

::

  sbt/sbt gen-idea

You then can run the project inside Eclipse or IntelliJ.

Distribute
~~~~~~~~~~

To package for distribution:

::

  sbt/sbt xitrum-package

Directory ``target/xitrum`` will be created.

To run:

::

  cd target/xitrum
  script/start

It will run ``main`` method in class ``skeleton.App``.
Please modify the start script if you want to run other.
