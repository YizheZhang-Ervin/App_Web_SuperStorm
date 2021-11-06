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

export const tableStore = {
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
            title: 'Lane',
            key: 'Lane',
            minWidth: 110
        },
        {
            title: 'NeighborLane',
            key: 'NeighborLane',
            minWidth: 170
        }
    ],
    tableData: genMockData(rawData, 30),
}

