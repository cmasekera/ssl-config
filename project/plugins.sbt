addSbtPlugin("com.github.gseitz"    % "sbt-release"         % "1.0.1")
addSbtPlugin("com.typesafe.sbt"     % "sbt-native-packager" % "1.0.0")
addSbtPlugin("com.typesafe.sbt"     % "sbt-osgi"            % "0.8.0")
addSbtPlugin("com.typesafe.sbt"     % "sbt-s3"              % "0.8")
addSbtPlugin("com.typesafe.sbt"     % "sbt-scalariform"     % "1.3.0")
addSbtPlugin("com.typesafe.sbt"     % "sbt-site"            % "0.8.2")
addSbtPlugin("com.typesafe.tmp"     % "sbt-header"          % "1.5.0-JDK6-0.1")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"             % "1.0.0")

// disable Reactive Platform subscription and version checks
onLoad in Global := identity
