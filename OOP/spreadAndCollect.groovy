class Endpoint {
    String endpointUuid
    List<String> vports
}

class Link {
    String linkid
    List<String> vport
}

class TopologyDetails {
    List<Endpoint> endpoints
    List<Link> links
    List<String> sharedvports
    String topologyTag
}

def ep1 = new Endpoint(endpointUuid: "444a14dc-781c-46aa-a1d9-1064b6ddcc9a", vports: ["514588f8-4be5-4e16-9ea5-e4def5496a6b",
                                                                                      "4b78f33f-c528-4584-938d-8c419a0899a6"])
def ep2 = new Endpoint(endpointUuid: "ad4a77fa-df03-46d7-acef-2f47c160a7c9", vports: ["cbb1dfcc-b188-4a56-8e19-4ea0f19915a3"])
def ep3 = new Endpoint(endpointUuid: "5de319aa-8a36-4bef-9be1-7dc1693b066c", vports: ["9336e8ea-86a9-4c94-9a39-6ed41a647e60"])
def link1 = new Link(linkid: "fc15f2332bf384d2", vport: ["514588f8-4be5-4e16-9ea5-e4def5496a6b",
                                                         "cbb1dfcc-b188-4a56-8e19-4ea0f19915a3"])
def link2 = new Link(linkid: "fefc28e640c65499", vport: ["9336e8ea-86a9-4c94-9a39-6ed41a647e60",
                                                         "4b78f33f-c528-4584-938d-8c419a0899a6"])

def topology = new TopologyDetails(endpoints: [ep1, ep2, ep3], links: [link1, link2],
        sharedvports: [], topologyTag: "c511706a-843c-4a22-91d7-89b17032cbef")

def endpointUuid = topology.endpoints*.endpointUuid

assert endpointUuid == ["444a14dc-781c-46aa-a1d9-1064b6ddcc9a",
                        "ad4a77fa-df03-46d7-acef-2f47c160a7c9",
                        "5de319aa-8a36-4bef-9be1-7dc1693b066c"]
endpointUuid.each {
    println it
}
println endpointUuid.collect() == ["444a14dc-781c-46aa-a1d9-1064b6ddcc9a",
                                   "ad4a77fa-df03-46d7-acef-2f47c160a7c9",
                                   "5de319aa-8a36-4bef-9be1-7dc1693b066c"]
assert topology.endpoints[0].endpointUuid == "444a14dc-781c-46aa-a1d9-1064b6ddcc9a"

//result
//444a14dc-781c-46aa-a1d9-1064b6ddcc9a
//ad4a77fa-df03-46d7-acef-2f47c160a7c9
//5de319aa-8a36-4bef-9be1-7dc1693b066c
//true