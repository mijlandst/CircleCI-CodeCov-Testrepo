# CircleCI-CodeCov-Testrepo
Documentation of my experience in using CirleCI and Coveralls together

## CirleCI

Setup for CircleCI was very simple. I simply clicked through the registration process and was immediately able to look at the CircleCI dashboard it even automatically gave me access to private CI-registered repositories in organizations I'm part of. When I added tests CircleCI did not immediately recognize them.

I looked at [the CircleCI 1.0 documentation](https://circleci.com/docs/1.0/configuration/) to get a feel for configuring CircleCI. There was not a lot to be configured, but it's good for future reference.

## CodeCov

CodeCov works by running a code coverage plugin in your repo and uploading it to a coverage tool. The setup was easiest for this tool, although every repo will need custom care for the first exercise, since private repositories use a token for ensuring private delivery.

Fortunately the documentation of CircleCI and CodeCov together made it easy to 
