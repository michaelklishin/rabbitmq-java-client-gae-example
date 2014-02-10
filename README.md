# RabbitMQ Java Client on Google App Engine Example

Google App Engine [restricts direct thread
instantiation](https://developers.google.com/appengine/docs/java/#Java_The_sandbox). This
repository contains an example that customizes RabbitMQ Java client thread
factory to make it possible to use the client on GAE.

This project requires RabbitMQ Java client 3.3
(unreleased as of February 2014).

## Building

    gradle assemble



## License & Copyright

(c) Michael S. Klishin, 2014

Released under the [MIT license](http://opensource.org/licenses/MIT).
