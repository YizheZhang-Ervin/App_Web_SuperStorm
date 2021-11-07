let rawData = [
    {
        id: 0,
        frameNUM: 0,
        carID: 0,
        xCen: 280,
        yCen: 23,
        xHead: 270,
        yHead: 23,
        xTail: 270,
        yTail: 23,
        velocity: 20,
        accelerate: 10,
        carL: 0,
        Lane: 8,
        NeighborLane: 9
    },
]

let genMockData = (data, counts) => {
    let rst = []
    for (let i = 0; i < counts; i++) {
        let temp = { ...data[0] };
        temp.id = i
        rst.push(temp)
    }
    return rst
}

export const exampleTable = {
    tableCol: [
        {
            title: 'id',
            key: 'id',
            minWidth: 110
        },
        {
            title: 'frameNUM',
            key: 'frameNUM',
            minWidth: 110
        },
        {
            title: 'carID',
            key: 'carID',
            minWidth: 110
        },
        {
            title: 'xCen',
            key: 'xCen',
            minWidth: 110
        },
        {
            title: 'yCen',
            key: 'yCen',
            minWidth: 110
        },
        {
            title: 'xHead',
            key: 'xHead',
            minWidth: 110
        },
        {
            title: 'yHead',
            key: 'yHead',
            minWidth: 110
        },
        {
            title: 'xTail',
            key: 'xTail',
            minWidth: 110
        },
        {
            title: 'yTail',
            key: 'yTail',
            minWidth: 110
        },
        {
            title: 'velocity',
            key: 'velocity',
            minWidth: 110
        },
        {
            title: 'accelerate',
            key: 'accelerate',
            minWidth: 110
        },
        {
            title: 'carL',
            key: 'carL',
            minWidth: 110
        },
        {
            title: 'lane',
            key: 'lane',
            minWidth: 110
        },
        {
            title: 'neighborLane',
            key: 'neighborLane',
            minWidth: 170
        },
        {
            title: 'changeDirection',
            key: 'changeDirection',
            minWidth: 170
        },
        {
            title: 'density',
            key: 'density',
            minWidth: 110
        },
        {
            title: 'occupancyCur',
            key: 'occupancyCur',
            minWidth: 170
        },
        {
            title: 'occupancyNeighborCur',
            key: 'occupancyNeighborCur',
            minWidth: 230
        },
        {
            title: 'dFront',
            key: 'dFront',
            minWidth: 110
        },
        {
            title: 'dBack',
            key: 'dBack',
            minWidth: 110
        },
        {
            title: 'vFront',
            key: 'vFront',
            minWidth: 110
        },
        {
            title: 'vBack',
            key: 'vBack',
            minWidth: 110
        },
        {
            title: 'dFrontN',
            key: 'dFrontN',
            minWidth: 110
        },
        {
            title: 'dBackN',
            key: 'dBackN',
            minWidth: 110
        },
        {
            title: 'vFrontN',
            key: 'vFrontN',
            minWidth: 110
        },
        {
            title: 'vBackN',
            key: 'vBackN',
            minWidth: 110
        },
        {
            title: 'relativePos',
            key: 'relativePos',
            minWidth: 170
        }
    ],
    tableData: genMockData(rawData, 30),
}

