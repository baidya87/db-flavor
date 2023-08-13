The DB flavor application showcases various ways to connect to databases.

H2 Data - in memory database, works with when no spring profile is selected ("default")
Spring automatically loads the configurations based on the H2 DB present on the classpath.


The other 2 profiles are "mysql" & "postgres".

Based on the profile, the ConnectConfiguration.java class with select the bean to configure.
@Profile("mysql") or @Profile("postgres")